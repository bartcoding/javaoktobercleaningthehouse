package be.intecbrussel.spring.springcoredemo;

public class Broom implements CleaningTool{

    private int id;

    public Broom(int id){
        this.id = id;
    }

    public void doCleanJob(){
        System.out.println("broomerdebroom, my broomid is: " + id);
    }

}
