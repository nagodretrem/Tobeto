package workshop.business;

import workshop.dataAccess.CarRepository;
import workshop.entities.Car;

import java.util.List;

public class CarServiceImpl implements CarService{

    private CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public Car getCarById(int id) {
        return carRepository.getCarById(id);
    }

    @Override
    public List<Car> getAllCars() {
        return carRepository.getAllCars();
    }

    @Override
    public void addCar(Car car) {
        carRepository.addCar(car);

    }

    @Override
    public void updateCar(Car car) {
        carRepository.updateCar(car);

    }

    @Override
    public void deleteCar(int id) {
        carRepository.deleteCar(id);

    }
}
