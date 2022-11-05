package itacademy.team2;

public class LorentzCalculatorWeight extends CalculatorWeight {
    public LorentzCalculatorWeight(int height) {
        super(height);
    }

    public int calculateIdealWeightByLorentz() {
        if (getHeight() != 0) {
            float weightResult = (getHeight() - 100) - (getHeight() - 150) / 2;
            return (int) weightResult;
        }
        return 0;
    }

    public static void showCalculatedWeightResult(int weight) {
        System.out.println("Calculated weight is " + weight);
    }
}
