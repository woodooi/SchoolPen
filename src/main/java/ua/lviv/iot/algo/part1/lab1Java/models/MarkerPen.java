package ua.lviv.iot.algo.part1.lab1Java.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor

public class MarkerPen extends Pen {
    private String name = "MarkerPen";
    private final int priceMarker = 4;
    private int numMarkers;

    public MarkerPen(final String id, final String brand,
                     final String color, final int num) {
        super("MarkerPen", id, brand, color);
        numMarkers = num;
    }

    @Override
    public final int calculatePrice() {
        return numMarkers * priceMarker;
    }

    @Override
    public final int itemsNum() {
        return numMarkers;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "name," + "priceMarker," + "numMarkers";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + this.name + "," + this.priceMarker + "," + this.numMarkers;
    }
}
