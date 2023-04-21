package ua.lviv.iot.algo.part1.lab1Java;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Getter

public class DoctorPen extends Pen {
    private boolean isStethoscope;
    private int numSyringes;

    DoctorPen(final String id, final String brand, final String color,
              final String material, final double size,
              final boolean stethoscope, final int syringes) {
        super(id, brand, color, material, size);
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
}
