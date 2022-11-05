package by.itacademy.team2;

public class CalculatorBroca extends Calculator {
    String gender;
    int wristGirth;
    int age;

    public CalculatorBroca(float height, int age, String gender, int wristGirth) {
        super(height);
        this.age = age;
        this.gender = gender;
        this.wristGirth = wristGirth;
    }

    public int ratioBroca() {
        height = (int) height;
        int ratio = 0;
        if (height < 165) {
            ratio = 100;
        } else if (height < 175) {
            ratio = 105;
        } else {
            ratio = 110;
        }

        return ratio;
    }

    public float ageСorrection(float weight) {
        if (age >= 20 && age <= 30) {
            weight = (float) (weight - (weight * 0.1));
        } else if (age >= 50) {
            weight = (float) (weight +  (weight * 0.06));
        }

        return weight;
    }


    public int calculate() {
        float ratioBroca = ratioBroca();
        float weight =  height - ratioBroca;
        System.out.println("Рост минус коэффициент: " + weight);

        weight = ageСorrection(weight);
        System.out.println("Корреция от возраста: " + weight);

        String bodyType = bodyType();
        weight = bodyTypeСorrection(bodyType, weight);
        System.out.println("Типа телосложения: " + bodyType);

        System.out.println("Корреция от типа телосложения: " + weight);

        return (int) Math.floor((double) weight);
    }

    public float bodyTypeСorrection(String bodyType, float weight) {
        if (bodyType.equals("asthenic")) {
            weight = (float) (weight - weight * 0.1);
        } else if (bodyType.equals("hypersthenic")) {
            weight = (float) (weight + weight * 0.1);
        }

        return weight;
    }

    public String bodyType() {
        String bodyType = "";
        if (gender.equals("male")) {
            if (wristGirth < 17) {
                bodyType = "asthenic";
            } else if (wristGirth <= 20) {
                bodyType = "normosthenic";
            } else {
                bodyType = "hypersthenic";
            }
        } else if (gender.equals("female")) {
            if (wristGirth < 16) {
                bodyType = "asthenic";
            } else if (wristGirth <= 18) {
                bodyType = "normosthenic";
            } else {
                bodyType = "hypersthenic";
            }
        }

        return bodyType;
    }


}
