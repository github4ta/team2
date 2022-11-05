package by.itacademy.team2;

import java.text.DecimalFormat;

/*
Расчет идеального веса через индекс массы тела. Индекс массы тела равен отношению массы тела в килограммах к квадрату росту в метрах.

Есть еще одна методика расчета идеального веса, кроме Расчет идеального веса по формуле Брока — расчет через Индекс Массы Тела. Понятие «Индекс Массы Тела» (ИМТ) было предложено бельгийским социологом и статистиком Адольфом Кетеле еще в 1869 году. Индекс массы тела равен отношению массы тела в килограммах к квадрату росту в метрах.
Полученное число соотносится с принятым в настоящее время соответствием:
менее 15 — острый дефицит массы
15–20 — недостаточная масса тела
20–25 — норма
25–30 — избыточная масса тела
30–35 — ожирение первой степени
35–40 ожирение второй степени
больше 40 — ожирение третьей степени

Исходя из нормы в 20–25 и роста можно рассчитать идеальный вес. Методика, как и все остальные методики, дает только примерный результат и рассчитана на взрослых.
Калькулятор ниже еще и посчитает ваш текущий индекс.
 */

public class Calculator {
    float height;
    int weight;

    public float bmi(){
        height = height / 100;
        float bmi = (float) (weight / Math.pow((double) height, 2));

        return bmi;
    }

    public int[] idealWeight(float height){
        height = height / 100;
        int[] idealWeight = new int[2];
        idealWeight[0] = (int) Math.pow((double) height, 2) * 20;
        idealWeight[1] = (int) Math.pow((double) height, 2) * 25;

        return idealWeight;
    }

    public String bmiCorresponds(float bmi){
        String corresponds = "";

        if(bmi < 15){
            corresponds = "Острый дефицит массы";
        }else if(bmi >= 15 && bmi < 20){
            corresponds = "Недостаточная масса тела";
        }else if(bmi >= 20 && bmi < 25){
            corresponds = "Норма";
        }else if(bmi >= 25 && bmi < 30){
            corresponds = "Избыточная масса тела";
        }else if(bmi >= 30 && bmi < 35){
            corresponds = "Ожирение первой степени";
        }else if(bmi >= 35 && bmi < 40){
            corresponds = "Ожирение второй степени";
        }else if(bmi >= 40){
            corresponds = "Ожирение третьей степени";
        }

        return corresponds;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
