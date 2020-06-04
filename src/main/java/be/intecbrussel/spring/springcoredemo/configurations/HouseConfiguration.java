package be.intecbrussel.spring.springcoredemo.configurations;


import be.intecbrussel.spring.springcoredemo.services.CleaningService;
import be.intecbrussel.spring.springcoredemo.services.GardeningService;
import be.intecbrussel.spring.springcoredemo.services.implementations.CleaningServiceImpl;
import be.intecbrussel.spring.springcoredemo.services.implementations.GardeningServiceImpl;
import be.intecbrussel.spring.springcoredemo.tools.GardeningTool;
import be.intecbrussel.spring.springcoredemo.tools.implementations.Broom;
import be.intecbrussel.spring.springcoredemo.tools.implementations.LawnMower;
import be.intecbrussel.spring.springcoredemo.tools.implementations.VacuumCleaner;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"be.intecbrussel.spring.springcoredemo"})
public class HouseConfiguration {


    @Bean
    public Broom broom(){
        return new Broom();
    }


    @Bean
    public CleaningService jill(Broom broom){
        return new CleaningServiceImpl(broom);
    }



}
