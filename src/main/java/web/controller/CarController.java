package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;
import web.Service.CarServiceImpl;


@Controller
public class CarController {
    private CarService carService;

    public CarController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String trackCars(ModelMap model,
                            @RequestParam(value = "count", defaultValue = "5") int count) {
        model.addAttribute("found", carService.getCars(count));
        return "cars";
    }
}