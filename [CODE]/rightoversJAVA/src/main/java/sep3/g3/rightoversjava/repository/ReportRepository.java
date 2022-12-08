package sep3.g3.rightoversjava.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sep3.g3.rightoversjava.model.FoodPost;
import sep3.g3.rightoversjava.model.Report;
import sep3.g3.rightoversjava.model.User;

import java.util.ArrayList;

@Repository
public interface ReportRepository extends CrudRepository<Report, Integer>
{
    ArrayList<Report> findAllByFoodPost(FoodPost foodPost);
    ArrayList<Report> findAllByUserReporting(User user);
}
