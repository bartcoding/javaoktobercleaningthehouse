package be.intecbrussel.spring.springcoredemo.services.implementations;

import be.intecbrussel.spring.springcoredemo.services.GardeningService;
import be.intecbrussel.spring.springcoredemo.tools.GardeningTool;
import be.intecbrussel.spring.springcoredemo.tools.implementations.LawnMower;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class GardeningServiceImpl implements GardeningService {

    private final GardeningTool tool;

    @Autowired
    public GardeningServiceImpl(@Qualifier("outsideTool") GardeningTool tool) {
        this.tool = tool;
    }

    @Override
    public void garden() {
        System.out.println("start gardening");
        tool.doGardenJob();
    }
}
