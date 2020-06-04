package be.intecbrussel.spring.springcoredemo;

import be.intecbrussel.spring.springcoredemo.configurations.HouseConfiguration;
import be.intecbrussel.spring.springcoredemo.services.GardeningService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HouseApp {

    public static void main(String[] args) {
        try(ConfigurableApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(HouseConfiguration.class)){

            applicationContext.getBean(GardeningService.class).garden();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }




    }

}
