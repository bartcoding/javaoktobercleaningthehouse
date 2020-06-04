package be.intecbrussel.spring.springcoredemo.tools.implementations;

import be.intecbrussel.spring.springcoredemo.tools.CleaningTool;
import org.springframework.stereotype.Component;

@Component
public class Sponge implements CleaningTool {
    @Override
    public void doCleanJob() {
        System.out.println("spongysponge");
    }
}
