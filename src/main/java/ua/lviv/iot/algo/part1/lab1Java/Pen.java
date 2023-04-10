package ua.lviv.iot.algo.part1.lab1Java;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor

public abstract class Pen {
    protected String id = "isn-101";
    protected String brand;
    protected String color;
    protected String material;
    protected double size;

    public abstract int calculatePrice();

    public abstract int itemsNum();
}
