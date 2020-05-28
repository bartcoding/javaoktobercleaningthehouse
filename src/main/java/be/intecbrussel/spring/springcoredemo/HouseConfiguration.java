package be.intecbrussel.spring.springcoredemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HouseConfiguration {

    @Bean
    public Broom broom(){
        return new Broom();
    }

}
