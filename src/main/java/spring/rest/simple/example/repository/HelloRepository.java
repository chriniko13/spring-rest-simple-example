package spring.rest.simple.example.repository;

import org.springframework.stereotype.Repository;

@Repository
public class HelloRepository {

    public String findHelloMessage() {
        return "Hello there!";
    }
}
