package ua.lviv.iot.algo.part1.lab1Java;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PenManagerTest {
    @Test
    void testFindAllWithMoreItemsThan() {

        List<Pen> allPens = new LinkedList<>();
        SchoolPen pen1 = new SchoolPen("","","","", 0, 3, 2, 0);
        DoctorPen pen2 = new DoctorPen("","","","", 3,true, 2);
        BuilderPen pen3 = new BuilderPen("","","","", 0, 3, 2);
        MarkerPen pen4 = new MarkerPen("","","","", 0, 0, "black");
        allPens.add(pen1);
        allPens.add(pen2);
        allPens.add(pen3);
        allPens.add(pen4);

        PenManager manager = new PenManager(allPens);
        List<Pen> result = manager.findAllWithMoreItemsThan(4);

        assertEquals(2, result.size());
    }
}
