package spring.rest.simple.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.rest.simple.example.domain.Motorcycle;
import spring.rest.simple.example.repository.MotorcycleRepository;

import java.util.List;

@Service
public class MotorcycleService {

    private final MotorcycleRepository motorcycleRepository;

    @Autowired
    public MotorcycleService(MotorcycleRepository motorcycleRepository) {
        this.motorcycleRepository = motorcycleRepository;
    }

    public List<Motorcycle> findAll() {
        return motorcycleRepository.findAll();
    }
}
