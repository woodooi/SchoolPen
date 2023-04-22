package ua.lviv.iot.algo.part1.lab1Java.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter

public class BuilderPen extends Pen {
    private String name = "BuilderPen";
    private int numWrenches;
    private int numScrewdrivers;

    public BuilderPen(final String id, final String brand, final String color,
                      final int wrenches, final int screws) {
        super("BuilderPen", id, brand, color);
        numWrenches = wrenches;
        numScrewdrivers = screws;
    }

    @Override
    public final int calculatePrice() {
        return 0;
    }

    @Override
    public final int itemsNum() {
        return numScrewdrivers + numWrenches;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "name," + "numWrenches," + "numScrewdrivers";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + this.name + "," + this.numWrenches + "," + this.numScrewdrivers;
    }
}
