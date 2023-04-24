package ua.lviv.iot.algo.part1.lab1Java.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter

public abstract class Pen {
    protected String name = "Pen";
    protected String id = "isn-101";
    protected String brand;
    protected String color;

    public abstract int calculatePrice();

    public abstract int itemsNum();

    public String getHeaders() {
        return "name," + "id," + "brand," + "color,";
    };

    public String toCSV() {
        return this.name + "," + this.id + "," + this.brand + "," + this.color + ",";
    };
}
