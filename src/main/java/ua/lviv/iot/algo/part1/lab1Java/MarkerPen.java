package ua.lviv.iot.algo.part1.lab1Java;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor

public class MarkerPen extends Pen {
    private final int priceMarker = 4;
    private int numMarkers;
    private String typeMarkers;

    MarkerPen(final String id, final String brand, final String color,
              final String material, final double size,
              final int num, final String type) {
        super(id, brand, color, material, size);
        numMarkers = num;
        typeMarkers = type;
    }

    @Override
    public final int calculatePrice() {
        return numMarkers * priceMarker;
    }

    @Override
    public final int itemsNum() {
        return numMarkers;
    }
}
