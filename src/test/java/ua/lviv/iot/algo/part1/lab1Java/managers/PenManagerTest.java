package ua.lviv.iot.algo.part1.lab1Java.managers;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.algo.part1.lab1Java.managers.PenManager;
import ua.lviv.iot.algo.part1.lab1Java.models.*;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class PenManagerTest {
    @Test
    void testFindAllWithMoreItemsThan() {

        List<Pen> allPens = new LinkedList<>();
        SchoolPen pen1 = new SchoolPen("","","", 0, 3, 2);
        DoctorPen pen2 = new DoctorPen("","","",true, 2);
        BuilderPen pen3 = new BuilderPen("","","", 0, 3);
        MarkerPen pen4 = new MarkerPen("","","", 0);
        allPens.add(pen1);
        allPens.add(pen2);
        allPens.add(pen3);
        allPens.add(pen4);

        PenManager manager = new PenManager();
        List<Pen> result = manager.findAllWithMoreItemsThan(4);

        assertEquals(2, result.size());
    }
}
