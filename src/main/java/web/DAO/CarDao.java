package web.DAO;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.List;

@Repository
public interface CarDao {
    List<Car> getCars(int count);
}
