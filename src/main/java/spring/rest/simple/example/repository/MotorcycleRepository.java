package spring.rest.simple.example.repository;

import org.springframework.stereotype.Repository;
import spring.rest.simple.example.domain.Motorcycle;

import java.util.Arrays;
import java.util.List;

@Repository
public class MotorcycleRepository {

    public List<Motorcycle> findAll() {

        return Arrays.asList(new Motorcycle("Ducati", "Monster 1200", "2013"),
                new Motorcycle("Yamaha", "MT9", "2015"));

    }
}
