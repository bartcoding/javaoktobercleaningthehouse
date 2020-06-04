package be.intecbrussel.spring.springcoredemo.tools.implementations;

import be.intecbrussel.spring.springcoredemo.tools.CleaningTool;
import org.springframework.stereotype.Component;


@Component
public class VacuumCleaner implements CleaningTool {
    public VacuumCleaner() {


    }

    @Override
    public void doCleanJob() {
        System.out.println("Wuuuuuuum");
    }
}
