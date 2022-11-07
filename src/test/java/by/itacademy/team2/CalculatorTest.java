package by.itacademy.team2;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testCalculateIdealWeightByBroca(){
        Calculator calculator = new Calculator();
        float height = 170;
        float expected = 65;
        float actual = calculator.calculateIdealWeightByBroca(height);

        assertEquals(expected, actual, 0.1);
    }

    @Test
    public void testCalculateIdealWeightByLorentz(){
        Calculator calculator = new Calculator();
        int height = 200;
        int expected = 75;

        int actual = calculator.calculateIdealWeightByLorentz(height);

       assertEquals(expected,actual);
    }
    @Test
    public void testCalculateIdealWeightByNegler() {
        Calculator calculator = new Calculator();
        float height = 160.0f;
        float expectedResult = 53f;

        float actualResult = calculator.сalculateIdealWeightByNegler(height);

        assertEquals(expectedResult, actualResult, 1);
    }
    @Test
    public void testCalculateIdealWeightByBrungardt() {
        Calculator calculator = new Calculator();
        int height = 160;
        int chestCircumference = 90;
        int expectedResult = 60;

        int actualResult = calculator.calculateIdealWeightByBrungardt( height, chestCircumference);

        assertEquals(expectedResult, actualResult);
    }
}

