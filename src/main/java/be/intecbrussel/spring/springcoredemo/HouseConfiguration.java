package be.intecbrussel.spring.springcoredemo;

import org.springframework.context.annotation.*;

@Configuration
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
