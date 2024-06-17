package web.DAO;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    List<Car> car = new ArrayList<>();

    {
        car.add(new Car(1, "audi", "v6", "red"));
        car.add(new Car(2, "lexus", "v6", "black"));
        car.add(new Car(3, "mercedes", "2.0", "red"));
        car.add(new Car(4, "volvo", "v8", "green"));
        car.add(new Car(5, "lada", "1,3", "black"));
    }

    @Override
    public List<Car> getCars(int count) {
        return car.stream().filter(x -> x.getCount() <= count).collect(Collectors.toList());
    }
}
