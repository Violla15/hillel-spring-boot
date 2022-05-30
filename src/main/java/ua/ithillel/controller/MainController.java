package ua.ithillel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.ithillel.domain.Car;
import ua.ithillel.service.CarService;

import java.util.List;

@Controller
public class MainController {

    @Value("${welcome.message}")
    private String message;

    @Autowired
    private CarService carService;

    @GetMapping("/")
    public String hello(Model model) {
        List<Car> cars = carService.getAllCars();
        model.addAttribute("message", message);
        model.addAttribute("cars", cars);

        return "index";
    }


}
