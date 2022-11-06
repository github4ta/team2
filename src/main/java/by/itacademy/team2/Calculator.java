package by.itacademy.team2;

import org.checkerframework.checker.units.qual.C;

public class Calculator {

    public int calculateIdealWeightByBroca(int height) {

        if (height < 100) {
            throw new IllegalArgumentException("If height < 100 weight will be negative. Please enter the correct height!");
        }
        int ratioBroca = 0;
        if (height < 165) {
            ratioBroca = 100;
        } else if (height < 175) {
            ratioBroca = 105;
        } else {
            ratioBroca = 110;
        }
        int idealWeightByBroca = height - ratioBroca;
        return idealWeightByBroca;
    }
}
