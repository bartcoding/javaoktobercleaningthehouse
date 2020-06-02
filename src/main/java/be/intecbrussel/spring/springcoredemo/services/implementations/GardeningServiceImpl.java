package be.intecbrussel.spring.springcoredemo.services.implementations;

import be.intecbrussel.spring.springcoredemo.services.GardeningService;
import be.intecbrussel.spring.springcoredemo.tools.GardeningTool;
import be.intecbrussel.spring.springcoredemo.tools.implementations.LawnMower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GardeningServiceImpl implements GardeningService {
    private GardeningTool tool;

    @Autowired
    public void setGardeningTool(GardeningTool tool){
        this.tool = tool;
    }

    @Override
    public String toString() {
        return "GardeningServiceImpl{" +
                "tool=" + tool +
                '}';
    }

    @Override
    public void garden() {
        System.out.println("start gardening");
        tool.doGardenJob();
    }
}
