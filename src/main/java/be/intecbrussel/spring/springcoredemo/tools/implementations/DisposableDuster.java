package be.intecbrussel.spring.springcoredemo.tools.implementations;

import be.intecbrussel.spring.springcoredemo.tools.CleaningTool;
import org.springframework.stereotype.Component;

@Component
public class DisposableDuster implements CleaningTool {
    private boolean used = false;
    @Override
    public void doCleanJob() {
        if (used){
            System.out.println("cleaning with a dirty duster");
            System.out.println("everything stays dirty");
        }
        else {
            System.out.println("cleaning with a clean duster");
            System.out.println("everything gets cleaned");
            used = true;
        }
    }
}
