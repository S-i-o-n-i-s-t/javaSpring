package org.example.config;

import org.example.domen.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {
    @Bean("mainCar")
    Car car1(){
        return new Car("V1", "BMV");
    }
    @Bean("Cfr")
    Car car2(){
        return new Car("V2", "volvo");
    }
    @Bean
    @Primary
    Car car3(){
        return new Car("V3", "Москвич");
    }
    @Bean
    String string(){
        return "text";
    }
    @Bean
    int integer(){
        return 10;
    }
}
