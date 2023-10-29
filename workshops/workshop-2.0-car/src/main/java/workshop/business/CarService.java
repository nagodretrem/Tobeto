package workshop.business;

import workshop.entities.Car;

import java.util.List;

public interface CarService {
    Car getCarById(int id);
    List<Car> getAllCars();
    void addCar(Car car);
    void updateCar(Car car);
    void deleteCar(int id);
}
