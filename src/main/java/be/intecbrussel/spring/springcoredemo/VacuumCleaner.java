package be.intecbrussel.spring.springcoredemo;

public class VacuumCleaner implements CleaningTool{
    public VacuumCleaner() {
        System.out.println("constructing a vacuumcleaner bean");

    }

    @Override
    public void doCleanJob() {
        System.out.println("Wuuuuuuum");
    }
}
