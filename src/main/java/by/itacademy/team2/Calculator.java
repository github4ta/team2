package by.itacademy.team2;

public class Calculator {
    float height;

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float сalculateIdealWeightByNegler(){
        float idealWeight = 45;
        float currentHeight = getHeight();
        currentHeight -= 152.4f;
        idealWeight += 0.9f * (currentHeight / 2.45f);
        idealWeight *= 1.1f;

        return idealWeight;
    }
    public float calculateIdealWeightByBroca() {
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
        float idealWeightByBroca = height - ratioBroca;
        return idealWeightByBroca;
    }
}
