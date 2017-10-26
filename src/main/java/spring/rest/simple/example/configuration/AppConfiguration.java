package spring.rest.simple.example.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = {"spring.rest.simple.example"})
@EnableWebMvc
public class AppConfiguration {
}
