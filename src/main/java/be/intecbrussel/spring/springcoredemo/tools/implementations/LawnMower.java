package be.intecbrussel.spring.springcoredemo.tools.implementations;

import be.intecbrussel.spring.springcoredemo.tools.GardeningTool;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Primary
@Qualifier("outsideTool")
public class LawnMower implements GardeningTool {

    @Override
    public void doGardenJob() {
        System.out.println("mowowowowowowowow");
    }
}
