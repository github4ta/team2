package by.itacademy.team2;

public class CalculatorByLorentz extends Calculator {

    public CalculatorByLorentz(float height) {
        super(height);
    }

    public int calculateIdealWeightByLorentz() {
        if (getHeight() != 0) {
            float weightResult = (getHeight() - 100) - (getHeight() - 150) / 2;
            return (int) weightResult;
        }
        return 0;
    }
}
