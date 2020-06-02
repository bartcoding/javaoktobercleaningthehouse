package be.intecbrussel.spring.springcoredemo.tools.implementations;

import be.intecbrussel.spring.springcoredemo.tools.GardeningTool;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("outsideTool")
public class GardenHose implements GardeningTool {
    @Override
    public void doGardenJob() {
        System.out.println("swswswswswswwswswswswsw");
    }
}
