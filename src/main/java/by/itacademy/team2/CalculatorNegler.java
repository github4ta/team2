package by.itacademy.team2;

/*
Ну и чтобы добить тему с расчетом идеального веса — расчет по формуле Неглера.
Идеальный вес — это 45 килограмм, плюс по 900 грамм за каждые 2.45 сантиметра сверх 152.4;
то, что получится, увеличить на 10 процентов. Вот так ловко,
хотя после знакомства с такой кучей методик уже берет сомнение, а надо ли это все :)
Калькулятор:
 */
public class CalculatorNegler extends Calculator {

    public CalculatorNegler(float height){
        super(height);
    }

    public float idealWeight(){
        float idealWeight = 45;
        height -= 152.4f;
        idealWeight += 0.9f * (height / 2.45f);
        idealWeight *= 1.1f;

        return idealWeight;
    }
}
