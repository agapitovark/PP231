package web.Dao;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Component
public class CarDaoimpl implements CarDao {

    private static int carsCount;

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(++carsCount, "BMW", 1995, 4.5));
        cars.add(new Car(++carsCount, "Lada", 1990, 2.5));
        cars.add(new Car(++carsCount, "Moskvich", 1998, 5.5));
        cars.add(new Car(++carsCount, "Ford", 1996, 7.5));
        cars.add(new Car(++carsCount, "Kia", 1997, 0.5));
    }
    public List<Car> getAllCars(){
        return cars;
    }

    public List<Car> getAmountCars(int amount){
        return cars.stream().limit(amount).collect(Collectors.toList());
    }
}
