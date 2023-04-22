package ua.lviv.iot.algo.part1.lab1Java.models;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor

public class SchoolPen extends Pen {
    private final int pricePen = 2;
    private final int pricePencil = 1;
    private final int priceEraser = 5;
    private int numPens;
    private int numPencils;
    private int numErasers;
    public SchoolPen(final String id, final String brand,
                     final String color, final int pens,
                     final int pencils, final int erasers) {
        super("SchoolPen", id, brand, color);
        this.numPens = pens;
        this.numPencils = pencils;
        this.numErasers = erasers;
    }
    public final void addPencil() {
        numPencils++;
    }

    @Override
    public final int itemsNum() {
        return numPens + numErasers + numPencils;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "numPens," + "numPencils," + "numErasers";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + this.numPens + "," + this.numPencils + "," + this.numErasers;
    }

    @Override
    public final int calculatePrice() {
        return numPens * pricePen
                + numPencils * pricePencil
                + numErasers * priceEraser;
    }
}
