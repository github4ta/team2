package by.itacademy.team2;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

    static Calculator calculator;

    @BeforeClass
    public static void beforeTest(){
        calculator = new Calculator();
    }

    @Test
    public void testCalculateIdealWeightByBroca(){
        //CalculatorBroca calculator = new CalculatorBroca();
        //calculator.calculate();
        //assertEquals(6, sum)
    }

    @Test
    public void testCalculateIdealWeightByLorentz(){
//        float height = 200f;
//        float expected = 25f;

//        float actual = calculator.calculateIdealWeightByLorentz();
//
//        Assert.assertEquals(expected,actual,0.1);
    }
}
