package workshop.dataAccess;

import workshop.entities.Car;

import java.util.ArrayList;
import java.util.List;

public class JpaCarRepository implements CarRepository{

    private List<Car> carList = new ArrayList<>();

    @Override
    public Car getCarById(int id) {
        for (Car car : carList) {
            if (car.getId() == id) {
                return car;
            }
        }
        return null; // Belirtilen ID'ye sahip araç bulunamazsa null döner.
    }

    @Override
    public List<Car> getAllCars() {
        return carList; // Tüm araçları döndürür.
    }

    @Override
    public void addCar(Car car) {
        carList.add(car); // Yeni bir araç ekler.
    }

    @Override
    public void updateCar(Car car) {
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getId() == car.getId()) {
                carList.set(i, car); // Araç güncellemesi yapar.
                break;
            }
        }
    }

    @Override
    public void deleteCar(int id) {
        carList.removeIf(car -> car.getId() == id); // Belirtilen ID'ye sahip aracı siler.

    }
}
