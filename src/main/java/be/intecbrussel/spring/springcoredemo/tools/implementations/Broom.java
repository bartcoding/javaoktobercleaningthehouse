package be.intecbrussel.spring.springcoredemo.tools.implementations;

import be.intecbrussel.spring.springcoredemo.tools.CleaningTool;

public class Broom implements CleaningTool {




    public Broom() {
        System.out.println("constructing a broom bean");
    }

    public void startmethode(){
        System.out.println("Broom readying to go");
    }

    public void doCleanJob(){
        System.out.println("broomerdebroom");
    }

}
