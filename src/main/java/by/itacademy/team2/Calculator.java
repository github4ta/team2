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
}
