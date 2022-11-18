package web.sevice;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getAllCars();
    List<Car> getAmountCars(int amount);
}
