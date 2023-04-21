package ua.lviv.iot.algo.part1.lab1Java;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter

public class BuilderPen extends Pen {
    private int numWrenches;
    private int numScrewdrivers;

    BuilderPen(final String id, final String brand, final String color,
               final String material, final double size,
               final int wrenches, final int screws) {
        super(id, brand, color, material, size);
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
}
