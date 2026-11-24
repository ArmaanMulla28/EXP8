
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {

        // TODO 1: Create an object of Calculator class
        Calculator calculator = new Calculator();
        this.calculator = calculator;

    }

    @Test
    public void testAddition() {

        // TODO 2: Call add() with two numbers
        double result = calculator.add(5, 3);

        // TODO 3: Verify result using assertEquals()
        assertEquals(8, result);

    }

    @Test
    public void testSubtraction() {

        // TODO 4: Call subtract() with two numbers
        double result = calculator.subtract(5, 3);

        // TODO 5: Verify expected result
        assertEquals(2, result);

    }

    @Test
    public void testMultiplication() {

        // TODO 6: Call multiply() with two numbers
        double result = calculator.multiply(5, 3);

        // TODO 7: Verify expected result
        assertEquals(15, result);

    }

    @Test
    public void testDivision() {

        // TODO 8: Call divide() with two non-zero numbers
        double result = calculator.divide(10, 2);

        // TODO 9: Verify expected result using assertEquals()
        // Use a delta for double values
        assertEquals(5, result, 0.001);

    }

    @Test
    public void testDivisionByZero() {

        // TODO 10: Verify IllegalArgumentException
        // Hint: Use assertThrows()
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));

    }

    @Test
    public void testAdditionWithNegativeNumbers() {

        // TODO 11: Test addition with negative numbers
        double result = calculator.add(-5, -3);

        // TODO 12: Verify expected result
        assertEquals(-8, result);

    }

    @Test
    public void testMultiplicationByZero() {

        // TODO 13: Verify multiplication by zero
        double result = calculator.multiply(5, 0);
        assertEquals(0, result);

    }

}
