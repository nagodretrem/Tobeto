package workshop;

import workshop.business.CarService;
import workshop.business.CarServiceImpl;
import workshop.dataAccess.JpaCarRepository;
import workshop.entities.Car;

public class Main {
    public static void main(String[] args) {
        JpaCarRepository jpaCarRepository = new JpaCarRepository();
        CarService carService = new CarServiceImpl(jpaCarRepository);


        // Araçları oluşturalım ve ekleyelim.
        Car car1 = new Car(1, "Toyota", "Corolla");
        Car car2 = new Car(2, "Honda", "Civic");
        carService.addCar(car1);
        carService.addCar(car2);

        // Tüm araçları alıp listeleme yapalım.
        System.out.println("Tüm Araçlar:");
        for (Car car : carService.getAllCars()) {
            System.out.println(car.getBrand() + " " + car.getModel());
        }

        // Belirli bir aracı ID'ye göre bulup gösterme yapalım.
        int carIdToFind = 2;
        Car foundCar = carService.getCarById(carIdToFind);
        if (foundCar != null) {
            System.out.println("\nAraç ID: " + carIdToFind + " Bulundu:");
            System.out.println(foundCar.getBrand()+ " " + foundCar.getModel());
        } else {
            System.out.println("\nAraç ID: " + carIdToFind + " Bulunamadı.");
        }

        // Araç güncelleme yapalım.
        int carIdToUpdate = 2;
        Car updatedCar = new Car(carIdToUpdate, "Honda", "Accord");
        carService.updateCar(updatedCar);
        System.out.println("\nAraç Güncelleme Sonrası:");
        System.out.println(carService.getCarById(carIdToUpdate).getBrand() + " " +
                (carService.getCarById(carIdToUpdate).getModel()));

        // Araç silme yapalım.
        int carIdToDelete = 2;
        carService.deleteCar(carIdToDelete);
        System.out.println("\nAraç Silindi, Kalan Araçlar:");
        for (Car car : carService.getAllCars()) {
            System.out.println(car.getBrand() + " " + car.getModel());
        }
    }
}