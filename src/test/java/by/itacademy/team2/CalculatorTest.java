package by.itacademy.team2;

import static org.junit.Assert.assertEquals;
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
}

