package be.intecbrussel.spring.springcoredemo.tools.implementations;

import be.intecbrussel.spring.springcoredemo.tools.GardeningTool;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class LawnMower implements GardeningTool {

    @Override
    public void doGardenJob() {
        String bla = null;
    }
}
