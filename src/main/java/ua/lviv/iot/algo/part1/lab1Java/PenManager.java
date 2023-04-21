package ua.lviv.iot.algo.part1.lab1Java;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
@Getter
@AllArgsConstructor

public class PenManager {
    public List<Pen> allPens = new LinkedList<>();

    public void addListOfPens(List<Pen> allPens) {
        this.allPens.addAll(allPens);
    }

    public void addPen(Pen pen) {
        this.allPens.add(pen);
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
}
//codeStyle

