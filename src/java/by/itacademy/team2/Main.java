package by.itacademy.team2;

import java.lang.Math.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        CalculatorBroca calculatorBrocaObj = new CalculatorBroca(175, 21, "female", 20);
        int brocaResult = calculatorBrocaObj.calculate();
        System.out.printf("Рекомендованный вес: %s\n", brocaResult);
        System.out.println();

        CalculatorBmi CalculatorBmiObj = new CalculatorBmi(175, 75);
        int bmi = CalculatorBmiObj.bmi();
        int[] idealWeight =  CalculatorBmiObj.idealWeight();
        String bmiCorresponds = CalculatorBmiObj.bmiCorresponds(bmi);
        System.out.printf("Индекс Массы Тела: %s\n", bmi);
        System.out.printf("Расчет идеального веса: от %s до %s кг.\n", idealWeight[0], idealWeight[1]);
        System.out.printf("Индекс Массы Тела соответствует: %s\n", bmiCorresponds);

    }
}
