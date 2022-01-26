package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class MyController {

    List<Car> carList = Arrays.asList(
            new Car("Mercedes", 999, "black"),
            new Car("Volvo", 777, "blue"),
            new Car("Bentley", 111, "grey"),
            new Car("Audi", 333, "red"),
            new Car("BMW", 222, "green")
    );

    @GetMapping
    String getCar(Model model, @RequestParam(value = "count", required = false) Integer count) {
        model.addAttribute("something", "Some cars are waiting...");
        if ((count == null) || (count > 5)) {
            model.addAttribute("table1", carList);
        } else {
            model.addAttribute("table1", carList.subList(0, count));
        }
        return "cars";
    }

}