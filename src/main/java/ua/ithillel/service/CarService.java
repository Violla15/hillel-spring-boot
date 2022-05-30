package ua.ithillel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.ithillel.domain.Car;
import ua.ithillel.repository.CarRepository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> getAllCars() {
        List<Car> allCars = new ArrayList<>();
        carRepository.findAll().forEach(allCars::add);
        return allCars;
    }

    public List<Car> findAllCarsByManufacturer(String manufacturer) {
        return carRepository.findAllByManufacturer(manufacturer);
    }

    public void createCar(Car car) {
        int maxId = getAllCars().stream()
                .map(Car::getId)
                .mapToInt(Long::intValue)
                .max()
                .orElseThrow();

        car.setId(maxId + 1);
        car.setAvailable(true);
        carRepository.save(car);
    }

    @Transactional
    public void deleteCar(long id) {
        carRepository.deleteCarById(id);
    }
}
