package spring.rest.simple.example.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.rest.simple.example.service.HelloService;

@RestController
@RequestMapping("/resources")
public class HelloResource {

    private final HelloService helloService;

    @Autowired
    public HelloResource(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok(helloService.sayHello());
    }

}
