package be.intecbrussel.spring.springcoredemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HouseApp {


    public static void main(String[] args) {
        try(ConfigurableApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(HouseConfiguration.class)){
            CleaningService service1 =
                    applicationContext.getBean("cleaningService",CleaningService.class);
            CleaningService service2 =
                    applicationContext.getBean("cleaningService2",CleaningService.class);
        service1.clean();
        service2.clean();


        }
        catch (Exception ex){
            ex.printStackTrace();
        }




    }

}
