package web.service;

import org.springframework.stereotype.Service;
import web.Dao.CarDao;
import web.model.Car;

import java.util.List;
@Service
public class CarServiceImpl implements web.sevice.CarService {

    CarDao carDao;
    @Override
    public List<Car> getAllCars() {
        return carDao.getAllCars();
    }
    public List<Car> getAmountCars(int amount){
        return carDao.getAmountCars(amount);
    }
}
