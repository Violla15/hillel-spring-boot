package ua.ithillel.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.ithillel.domain.Car;
import ua.ithillel.service.CarService;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarRestController {

    @Autowired
    private CarService carService;

    @GetMapping
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping("{manufacturer}")
    public List<Car> getAllCarsByModel(@PathVariable String manufacturer) {
        return carService.findAllCarsByManufacturer(manufacturer);
    }
}
