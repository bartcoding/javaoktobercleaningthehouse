package be.intecbrussel.spring.springcoredemo;

public class CleaningService {
    private CleaningTool tool;

    public CleaningService(CleaningTool tool){
        this.tool = tool;
    }


    public void clean(){
        System.out.println("starting cleaning service:");
        tool.doCleanJob(); //nullpointer
        System.out.println("stopping cleaning service!");
    }

}
