package spring.rest.simple.example.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.rest.simple.example.domain.Motorcycles;
import spring.rest.simple.example.service.MotorcycleService;

@RestController
@RequestMapping("resources")
public class MotorcycleResource {


    private final MotorcycleService motorcycleService;

    @Autowired
    public MotorcycleResource(MotorcycleService motorcycleService) {
        this.motorcycleService = motorcycleService;
    }

    @GetMapping("motorcycles")
    public Motorcycles findAll() {
        return new Motorcycles(motorcycleService.findAll());
    }


}
