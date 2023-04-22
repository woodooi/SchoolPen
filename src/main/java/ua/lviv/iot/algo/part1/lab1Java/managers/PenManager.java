package ua.lviv.iot.algo.part1.lab1Java.managers;


import lombok.Getter;
import ua.lviv.iot.algo.part1.lab1Java.models.*;
import ua.lviv.iot.algo.part1.lab1Java.writers.PenWriter;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Getter

public class PenManager {
    public List<Pen> allPens = new LinkedList<>();

    public void addListOfPens(List<Pen> allPen) {
        this.allPens.addAll(allPen);
    }

    public void addPen(Pen pen) {
        allPens.add(pen);
    }

    public List<Pen> findAllWorthMoreThan(final int price) {
        return allPens.stream()
                      .filter(pen -> pen.calculatePrice() > price)
                      .collect(Collectors.toList());
    }

    public List<Pen> findAllWithMoreItemsThan(final int number) {
        return allPens.stream()
                      .filter(pen -> pen.itemsNum() > number)
                      .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        PenManager myManager = new PenManager();
        List<Pen> backpack = new LinkedList<>();
        SchoolPen superSchool = new SchoolPen("0-1a", "merc", "black", 3, 4 ,5);
        MarkerPen superMarker = new MarkerPen("0-1b", "lanos", "purple", 3);
        backpack.add(superMarker); backpack.add(superSchool);
        System.out.println(superSchool.toCSV());
        myManager.addListOfPens(backpack);
        PenWriter writer = new PenWriter();
        writer.writeToFile(myManager.allPens);
    }
}
//codeStyle

