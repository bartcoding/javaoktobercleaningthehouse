package be.intecbrussel.spring.springcoredemo.services.implementations;


import be.intecbrussel.spring.springcoredemo.services.CleaningService;
import be.intecbrussel.spring.springcoredemo.tools.CleaningTool;


public class CleaningServiceImpl implements CleaningService {

    private CleaningTool tool;

    public CleaningServiceImpl(CleaningTool tool){
        System.out.println("constructing a cleaningserviceImpl");
        this.tool = tool;
    }


    public void clean(){
        System.out.println("starting cleaning service:");
        tool.doCleanJob(); //nullpointer
        System.out.println("stopping cleaning service!");
    }


}
