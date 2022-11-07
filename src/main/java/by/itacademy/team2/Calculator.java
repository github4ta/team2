package by.itacademy.team2;

public class Calculator {
    public float calculateIdealWeightByBroca(float height) {
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
        return height - ratioBroca;
    }

    public int calculateIdealWeightByLorentz(int height) {
        if (height != 0) {
            int weightResult = (height - 100) - (height - 150) / 2;
            return (int) weightResult;
        }
        return 0;
    }

    public int calculateIdealWeightByBrungardt(int height, int chestCircumference) {
        return (height * chestCircumference) / 240;
    }

    public float сalculateIdealWeightByNegler(float height){
        float idealWeight = 45f;
        height -= 152.4f;
        idealWeight += 0.9f * (height / 2.45f);
        idealWeight *= 1.1f;

        return idealWeight;
    }
}
