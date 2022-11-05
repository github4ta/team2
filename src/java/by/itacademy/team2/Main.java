package by.itacademy.team2;

import java.lang.Math.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setHeight(175);
        calculator.setWeight(75);

        System.out.println(Arrays.toString(calculator.idealWeight(175)));

        //String bmiFormat = new DecimalFormat("#0.0").format(bmi);
        System.out.println(calculator.bmiCorresponds(calculator.bmi()));
    }
}
