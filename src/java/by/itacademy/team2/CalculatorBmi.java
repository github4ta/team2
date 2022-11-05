package by.itacademy.team2;

public class CalculatorBmi extends Calculator {

    public CalculatorBmi() {
    }
    public CalculatorBmi(float height, float weight) {
        super(height, weight);
    }

    public int bmi(){
        double heightDiv = height / 100;
        float bmi = (float) (weight / Math.pow(heightDiv, 2));

        return (int) Math.floor((double) bmi);
    }

    public int[] idealWeight(){
        double heightDiv = height / 100;
        //System.out.println(height);
        int[] idealWeight = new int[2];
        double heightPow = Math.pow(heightDiv, 2);
        idealWeight[0] = (int) heightPow * 20;
        idealWeight[1] = (int) heightPow * 25;

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
}
