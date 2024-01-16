package org.example.config;


import org.example.domain.Car;
import org.example.domain.Engin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("H:\\\\Java Project\\\\javaSpring\\\\lekcion2\\\\practica\\\\primer2\\\\src\\\\main\\\\java\\\\org\\\\example\\\\domain")//""
public class ProjectConfig {
//    @Bean
//    Engin engin(){
//        return new Engin();
//    }
//
//
//    @Bean
//    Car car3(){
//        Car car = new Car();
//        car.setModel("Mocквич");
//        car.setMade("V8");
//        car.setEngin(engin());
//        return car;// "V3", "Москвич"
//    }
}
