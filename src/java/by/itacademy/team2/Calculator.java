package by.itacademy.team2;

public class Calculator {
    float height;
    float weight;

    public Calculator() {
    }
    public Calculator(float height, float weight) {
        this.height = height;
        this.weight = weight;
    }

    public Calculator(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
