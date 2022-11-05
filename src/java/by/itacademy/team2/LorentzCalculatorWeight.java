package java.by.itacademy.team2;

public class LorentzCalculatorWeight extends CalculatorWeight {
    public LorentzCalculatorWeight(int height) {
        super(height);
    }

    public int calculateIdealWeightByLorentz() {
        float weightResult = (getHeight() - 100) - (getHeight() - 150) / 2;
        return (int) weightResult;
    }

    public static void showCalculatedWeightResult(int weight) {
        System.out.println("Calculated weight is + " + weight);
    }
}
