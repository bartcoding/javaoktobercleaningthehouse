package be.intecbrussel.spring.springcoredemo;

public class HouseApp {


    public static void main(String[] args) {
        CleaningService cleaningService = new CleaningService(new VacuumCleaner());
        cleaningService.clean();
    }

}
