package itacademy.team2;

public class Main {
    public static void main(String[] args) {
        LorentzCalculatorWeight lorentzCalculatorWeight = new LorentzCalculatorWeight(0);
        int calculatedWeightByLorentz = lorentzCalculatorWeight.calculateIdealWeightByLorentz();
        LorentzCalculatorWeight.showCalculatedWeightResult(calculatedWeightByLorentz);

    }


}
