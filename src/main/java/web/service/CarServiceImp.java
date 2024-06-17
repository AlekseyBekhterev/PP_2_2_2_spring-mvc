package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService {

    private CarDaoImpl carDao;

    @Autowired
    public CarServiceImp(CarDaoImpl carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getCars(int count) {
        return carDao.getCars(count);
    }

}
