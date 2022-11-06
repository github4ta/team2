package by.itacademy.team2;

public class Calculator {
    float height;

    public int calculateIdealWeightByLorentz() {
        if (height != 0) {
            float weightResult = (height - 100) - (height - 150) / 2;
            return (int) weightResult;
        }
        return 0;
    }
}
