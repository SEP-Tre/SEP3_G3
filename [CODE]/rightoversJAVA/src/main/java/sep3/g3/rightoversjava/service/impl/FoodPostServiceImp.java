package sep3.g3.rightoversjava.service.impl;

import org.springframework.stereotype.Service;
import sep3.g3.rightoversjava.model.FoodPost;
import sep3.g3.rightoversjava.model.Report;
import sep3.g3.rightoversjava.model.Reservation;
import sep3.g3.rightoversjava.model.User;
import sep3.g3.rightoversjava.model.dto.FoodPostCreationDTO;
import sep3.g3.rightoversjava.model.dto.PickUpDto;
import sep3.g3.rightoversjava.model.dto.ReportCreationDto;
import sep3.g3.rightoversjava.model.dto.ReservationCreationDto;
import sep3.g3.rightoversjava.repository.FoodPostRepository;
import sep3.g3.rightoversjava.repository.ReportRepository;
import sep3.g3.rightoversjava.repository.ReservationRepository;
import sep3.g3.rightoversjava.repository.UserRepository;
import sep3.g3.rightoversjava.service.interaces.FoodPostService;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class FoodPostServiceImp implements FoodPostService
{

    private final FoodPostRepository fpRepository;
    private final UserRepository userRepository;
    private final ReservationRepository reservationRepository;
    private final ReportRepository reportRepository;

    public FoodPostServiceImp(FoodPostRepository fpRepository, UserRepository userRepository, ReservationRepository reservationRepository, ReportRepository reportRepository)
    {
        this.fpRepository = fpRepository;
        this.userRepository = userRepository;
        this.reservationRepository = reservationRepository;
        this.reportRepository = reportRepository;
    }

    public FoodPost create(FoodPostCreationDTO dto) throws Exception
    {
        Optional<User> desiredUser = userRepository.findById(dto.getUsername());
        if (desiredUser.isEmpty())
        {
            throw new Exception("This user does not exist.");
        }
        User user = desiredUser.get();
        Timestamp timestamp = Timestamp.valueOf(LocalDateTime.now());

        FoodPost fpObj = new FoodPost(
                0, //placeholder hopefully?
                dto.getTitle(),
                dto.getCategory_(),
                dto.getDescription(),
                dto.getPictureUrl(),
                dto.getDaysUntilExpired(),
                "posted",
                timestamp,
                dto.getStartDate(),
                dto.getEndDate(),
                dto.getStartTime(),
                dto.getEndTime(),
                user
        );
        return fpRepository.save(fpObj);
    }

    @Override
    public ArrayList<FoodPost> getAllFoodPosts()
    {
        return (ArrayList<FoodPost>) fpRepository.findAll();
    }

    @Override
    public ArrayList<FoodPost> getAllFoodPostsByUsername(String username) throws Exception
    {
        Optional<User> existingUser = userRepository.findById(username);
        if (existingUser == null)
        {
            throw new Exception("User not found.");
        }
        return new ArrayList<>(fpRepository.getFoodPostsByUser(existingUser.get()));
    }

    @Override
    public FoodPost getSingleFoodPost(int id) throws NoSuchElementException
    {
        Optional<FoodPost> foodPostOptional = fpRepository.findById(id);
        if (foodPostOptional.isEmpty())
        {
            throw new NoSuchElementException("Food post with such ID does not exist.");
        }
        return foodPostOptional.get();
    }

    // Should this return something? - CF
    // TODO: Add user
    @Override
    public void reserve(ReservationCreationDto dto)
    {
        // Change the state of the post
        FoodPost foodPost = fpRepository.findById(dto.getFoodPostId()).get();
        if (!foodPost.getPostState().equals("posted"))
        {
            throw new IllegalArgumentException("This post is not available to reserve");
        }

        // Save the reservation to the table
        User user = userRepository.findById(dto.getUsername()).get();
        if (user.isBusiness())
        {
            throw new IllegalArgumentException("As a business, you cannot reserve food. " +
                    "Please use a personal account");
        }
        if (user.getUsername().equals(foodPost.getUser().getUsername()))
        {
            throw new IllegalArgumentException("You can't reserve your own post. Just eat it.");
        }
        foodPost.setPostState("reserved");
        // Because of the matching id, this should update instead of add a new tuple
        fpRepository.save(foodPost);
        Reservation reservation = new Reservation(foodPost, user);
        reservationRepository.save(reservation);
    }

    @Override
    public FoodPost pickUp(PickUpDto dto) throws IllegalAccessException
    {
        Optional<FoodPost> foodPost = fpRepository.findById(dto.getId());
        if (foodPost.isEmpty())
        {
            throw new NoSuchElementException("Food post not found.");
        }
        FoodPost fpToBeUpdated = foodPost.get();
        if (fpToBeUpdated.getPostState().equals("closed"))
        {
            throw new IllegalAccessException("This food post is already picked up!");
        }
        if (fpToBeUpdated.getPostState().equals("posted"))
        {
            throw new IllegalAccessException("This food post is not reserved!");
        }

        Reservation reservation = reservationRepository.findByFoodPost(fpToBeUpdated);
        if (!dto.getUsername().equals(reservation.getUser().getUsername()))
        {
            throw new IllegalAccessException("The user trying to pick up is not the one who reserved!");
        }


        fpToBeUpdated.setPostState("closed");
        FoodPost udpatedFp = fpRepository.save(fpToBeUpdated);
        return udpatedFp;
    }

    public void delete(int id)
    {
        Optional<FoodPost> foodPost = fpRepository.findById(id);
        if (foodPost.isPresent())
        {
            Reservation reservation = reservationRepository.findByFoodPost(foodPost.get());
            if (reservation != null)
            {
                reservationRepository.delete(reservation);
            }
            ArrayList<Report> reports = reportRepository.findAllByFoodPost(foodPost.get());
            if (reports.size() > 0)
            {
                reportRepository.deleteAll(reports);
            }
            fpRepository.deleteById(id);
        }
    }

    @Override
    public Report report(ReportCreationDto dto)
    {
        Optional<FoodPost> foodPost = fpRepository.findById(dto.getFoodPostId());
        if(foodPost.isEmpty())
        {
            throw new NoSuchElementException("FoodPost not found.");
        }
        Optional<User> user = userRepository.findById(dto.getUsernameReporting());
        if(user.isEmpty())
        {
            throw new NoSuchElementException("User not found.");
        }
        Report report = new Report(0, foodPost.get(), dto.getComment(), user.get());
        Report savedReport = reportRepository.save(report);
        return savedReport;
    }

    @Override
    public ArrayList<FoodPost> getAllReportedPosts() {
        return new ArrayList<>(fpRepository.getAllByPostStateIsLike("reported"));
    }


}
