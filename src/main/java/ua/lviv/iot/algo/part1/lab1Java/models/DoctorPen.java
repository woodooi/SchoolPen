package ua.lviv.iot.algo.part1.lab1Java.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Getter

public class DoctorPen extends Pen {
    private boolean isStethoscope;
    private int numSyringes;

    public DoctorPen(final String id, final String brand, final String color,
                     final boolean stethoscope, final int syringes) {
        super("DoctorPen", id, brand, color);
        isStethoscope = stethoscope;
        numSyringes = syringes;
    }

    @Override
    public final int calculatePrice() {
        return 0;
    }

    @Override
    public final int itemsNum() {
        if (isStethoscope) {
            return numSyringes + 1;
        } else {
            return numSyringes;
        }
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "isStethoscope" + "numSyringes";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + this.isStethoscope + "," + this.numSyringes;
    }
}
