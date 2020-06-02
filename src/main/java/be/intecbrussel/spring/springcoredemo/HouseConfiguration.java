package be.intecbrussel.spring.springcoredemo;


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
@ComponentScan
public class HouseConfiguration {

    @Bean(initMethod = "startmethode")
    public Broom broom(){
        return new Broom();
    }
    @Bean
    public VacuumCleaner vacuum(){
        return new VacuumCleaner();
    }


    @Bean
    @Lazy
    public CleaningService jill(Broom broom){
        return new CleaningServiceImpl(broom);
    }
    @Bean
    @Lazy
    public CleaningService jane(VacuumCleaner vacuum){
        return new CleaningServiceImpl(vacuum);
    }
    @Bean
    @Lazy
    public CleaningService richard(Broom broom){
        return new CleaningServiceImpl(broom);
    }


}
