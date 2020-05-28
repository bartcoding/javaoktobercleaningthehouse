package be.intecbrussel.spring.springcoredemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HouseApp {


    public static void main(String[] args) {
        try(ConfigurableApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(HouseConfiguration.class)){
            CleaningTool cleaningTool = applicationContext.getBean(CleaningTool.class);
            cleaningTool.doCleanJob();


        }
        catch (Exception ex){
            ex.printStackTrace();
        }




    }

}
