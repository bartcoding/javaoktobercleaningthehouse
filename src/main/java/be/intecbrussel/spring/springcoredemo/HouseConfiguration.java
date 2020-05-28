package be.intecbrussel.spring.springcoredemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class HouseConfiguration {

    static int id =0;

    @Bean
    @Primary
    @Scope("prototype")
    public Broom broom(){
        id++;
        return new Broom(id);
    }

    @Bean
    public CleaningService cleaningService(Broom broom){
        return new CleaningService(broom);
    }
    @Bean
    public CleaningService cleaningService2(Broom broom){
        return new CleaningService(broom);
    }
}
