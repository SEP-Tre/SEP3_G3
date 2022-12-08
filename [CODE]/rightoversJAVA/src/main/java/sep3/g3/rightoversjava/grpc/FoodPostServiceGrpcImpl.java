package sep3.g3.rightoversjava.grpc;

import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import sep3.g3.rightoversjava.grpc.converter.interaces.FoodPostConverter;
import sep3.g3.rightoversjava.grpc.generated.*;
import sep3.g3.rightoversjava.model.FoodPost;
import sep3.g3.rightoversjava.model.Report;
import sep3.g3.rightoversjava.model.dto.FoodPostCreationDTO;
import sep3.g3.rightoversjava.model.dto.PickUpDto;
import sep3.g3.rightoversjava.model.dto.ReportCreationDto;
import sep3.g3.rightoversjava.model.dto.ReservationCreationDto;
import sep3.g3.rightoversjava.service.interaces.FoodPostService;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.NoSuchElementException;

@Configurable
public class FoodPostServiceGrpcImpl extends FoodPostServiceGrpc.FoodPostServiceImplBase
{

    @Autowired
    private FoodPostService service;
    @Autowired
    private FoodPostConverter converter;

    public FoodPostServiceGrpcImpl()
    {
        service = SpringContext.getBean(FoodPostService.class);
        converter = SpringContext.getBean(FoodPostConverter.class);
    }

    @Override
    public void post(FoodPostRequest request, StreamObserver<FoodPostResponse> responseObserver)
    {
        Date sd = request.getStartDate();
        Date ed = request.getEndDate();
        Time st = request.getStartTime();
        Time et = request.getEndTime();
        LocalDate startDate = LocalDate.of(sd.getYear(), sd.getMonth(), sd.getDay());
        LocalDate endDate = LocalDate.of(ed.getYear(), ed.getMonth(), ed.getDay());
        LocalTime startTime = LocalTime.of(st.getHour(), st.getMinutes());
        LocalTime endTime = LocalTime.of(et.getHour(), et.getMinutes());
        FoodPostCreationDTO dto = new FoodPostCreationDTO(request.getTitle(), request.getCategory(), request.getDescription(), request.getPictureUrl(), request.getDaysUntilExpired(), startDate, endDate, startTime, endTime, request.getUsername());
        try
        {
            FoodPost created = service.create(dto);
            FoodPostResponse response = converter.getFoodPostResponse(created);
            responseObserver.onNext(response);
            responseObserver.onCompleted();

        } catch (Exception e)
        {
            responseObserver.onError(e);
        }

    }


    @Override
    public void getAllFoodPosts(GetAllRequest request,
                                StreamObserver<FoodPostResponse> responseObserver)
    {
        ArrayList<FoodPost> allPosts = service.getAllFoodPosts();
        // System.out.println("All posts: " + allPosts.toString());
        for (int i = 0; i < allPosts.size(); i++)
        {
            FoodPost foodPost = allPosts.get(i);
            FoodPostResponse response = converter.getFoodPostResponse(foodPost);

            responseObserver.onNext(response);
        }
        responseObserver.onCompleted();
    }

    @Override
    public void getSingleFoodPost(FoodPostID request, StreamObserver<FoodPostResponse> responseObserver)
    {
        try
        {
            FoodPost foodPost = service.getSingleFoodPost(request.getId());
            FoodPostResponse response = converter.getFoodPostResponse(foodPost);
            responseObserver.onNext(response);
            responseObserver.onCompleted();

        } catch (NoSuchElementException e)
        {
            responseObserver.onError(e);
        }
    }

    @Override
    public void reserve(FoodPostReservation request, StreamObserver<ReservationResponse> responseObserver)
    {
        try
        {
            service.reserve(new ReservationCreationDto(
                    request.getFoodpostId(),
                    request.getUsername()
            ));
            ReservationResponse response = ReservationResponse.newBuilder().setFiller(true).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e)
        {
            e.printStackTrace();
            responseObserver.onError(
                    io.grpc.Status.INVALID_ARGUMENT
                            .withDescription(e.getMessage())
                            .asRuntimeException());
        }
    }

    @Override
    public void getFoodPostsByUsername(FPByUsernameRequest request, StreamObserver<FoodPostResponse> responseObserver)
    {
        String username = request.getUsername();
        try
        {
            ArrayList<FoodPost> allPosts = service.getAllFoodPostsByUsername(username);
            for (int i = 0; i < allPosts.size(); i++)
            {
                FoodPost foodPost = allPosts.get(i);
                FoodPostResponse response = converter.getFoodPostResponse(foodPost);
                responseObserver.onNext(response);
            }
            responseObserver.onCompleted();
        } catch (Exception e)
        {
            responseObserver.onError(e);
        }
    }

    @Override
    public void pickUp(PickUpRequest request, StreamObserver<FoodPostResponse> responseObserver)
    {
        //so I do the converter and service, let's start with service.
        PickUpDto dto = converter.getPickUpDtoFromPickUpRequest(request);
        try
        {
            FoodPost foodPost = service.pickUp(dto);
            responseObserver.onNext(converter.getFoodPostResponse(foodPost));
            responseObserver.onCompleted();
        } catch (IllegalAccessException e)
        {
            e.printStackTrace();
            responseObserver.onError(io.grpc.Status.INVALID_ARGUMENT
                    .withDescription(e.getMessage())
                    .asRuntimeException());
        }
    }

    @Override
    public void delete(FoodPostID request, StreamObserver<ReservationResponse> responseObserver)
    {
        service.delete(request.getId());
        ReservationResponse response = ReservationResponse.newBuilder().setFiller(true).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void report(ReportMessage request, StreamObserver<ReportMessage> responseObserver)
    {
        ReportCreationDto dto = converter.getReportCreationDtoFromRequest(request);
        try
        {
            Report report = service.report(dto);
            ReportMessage message = converter.getReportMessageFromReport(report);
            responseObserver.onNext(message);
            responseObserver.onCompleted();
        } catch (NoSuchElementException e)
        {
            e.printStackTrace();
            responseObserver.onError(io.grpc.Status.INVALID_ARGUMENT
                    .withDescription(e.getMessage())
                    .asRuntimeException());
        }
    }

    @Override
    public void getAllReportedPosts(ReservationResponse request, StreamObserver<FoodPostResponse> responseObserver) {
        try
        {
            ArrayList<FoodPost> posts = service.getAllReportedPosts();
            for (FoodPost post:
                 posts) {
                responseObserver.onNext(converter.getFoodPostResponse(post));
            }
            responseObserver.onCompleted();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            responseObserver.onError(io.grpc.Status.INVALID_ARGUMENT
                    .withDescription(e.getMessage())
                    .asRuntimeException());
        }
    }

    @Override
    public void getReportsOnPost(FoodPostID request, StreamObserver<ReportMessage> responseObserver) {
        try
        {
            ArrayList<Report> reports = service.getReportsOnPost(request.getId());
            for (Report report:
                 reports) {
                responseObserver.onNext(converter.getReportMessageFromReport(report));
            }
            responseObserver.onCompleted();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            responseObserver.onError(io.grpc.Status.INVALID_ARGUMENT
                    .withDescription(e.getMessage())
                    .asRuntimeException());
        }
    }

    @Override
    public void edit(FoodPostResponse request, StreamObserver<FoodPostResponse> responseObserver) {
        try {
            FoodPost foodPostRequest = converter.getFoodPostFromResponse(request);
            FoodPost editedPost = service.edit(foodPostRequest);
            responseObserver.onNext(converter.getFoodPostResponse(editedPost));
            responseObserver.onCompleted();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            responseObserver.onError(io.grpc.Status.INVALID_ARGUMENT
                    .withDescription(e.getMessage())
                    .asRuntimeException());
        }
    }
}
