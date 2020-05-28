package be.intecbrussel.spring.springcoredemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class HouseConfiguration {

    @Bean
    @Primary
    public Broom broom(){
        return new Broom();
    }

    @Bean
    public Broom otherBroom(){
        return new Broom();
    }


    @Bean
    public CleaningService cleaningService(Broom broom){
        return new CleaningService(broom);
    }
}
