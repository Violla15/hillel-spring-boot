package ua.ithillel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ua.ithillel.domain.Car;
import ua.ithillel.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping(value = "/add")
    public String addCar(Model model) {
        model.addAttribute("car", new Car());
        return "addCar";
    }

    @PostMapping("/create")
    public String createCar(@ModelAttribute("car") Car car) {
        carService.createCar(car);
        return "redirect:/";
    }

    @PostMapping("/delete/{id}")
    public String deleteCar(@PathVariable("id") long id) {
        carService.deleteCar(id);
        return "redirect:/";
    }
}
