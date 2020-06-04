package be.intecbrussel.spring.springcoredemo.services.implementations;

import be.intecbrussel.spring.springcoredemo.services.CleaningService;
import be.intecbrussel.spring.springcoredemo.services.DomesticService;
import be.intecbrussel.spring.springcoredemo.services.GardeningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class DomesticServiceImpl implements DomesticService {
    private CleaningService cleaningService;
    private GardeningService gardeningService;

    @Autowired
    public void setCleaningService(CleaningService cleaningService) {
        this.cleaningService = cleaningService;
    }
    @Autowired
    public void setGardeningService(GardeningService gardeningService) {
        this.gardeningService = gardeningService;
    }

    @Override
    public void runHousehold() {
        cleaningService.clean();
        gardeningService.garden();
    }
}
