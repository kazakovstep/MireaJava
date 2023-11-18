package lab22.number2;

import lab22.number1.Calculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAddition() {
        double result = calculator.calculate("2 3 +");
        assertEquals(5.0, result, 0.001);
    }

    @Test
    public void testSubtraction() {
        double result = calculator.calculate("5 3 -");
        assertEquals(2.0, result, 0.001);
    }

    @Test
    public void testMultiplication() {
        double result = calculator.calculate("4 2 *");
        assertEquals(8.0, result, 0.001);
    }

    @Test
    public void testDivision() {
        double result = calculator.calculate("6 3 /");
        assertEquals(2.0, result, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyStack() {
        calculator.calculate("2 +");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidExpression() {
        calculator.calculate("2 3 + *");
    }
}
