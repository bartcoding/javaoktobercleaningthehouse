package be.intecbrussel.spring.springcoredemo;

public class VacuumCleaner implements CleaningTool{
    @Override
    public void doCleanJob() {
        System.out.println("Wuuuuuuum");
    }
}
