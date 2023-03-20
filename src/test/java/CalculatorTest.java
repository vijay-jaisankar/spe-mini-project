import org.example.Calculator;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest{
    // Calculator object
    Calculator c = new Calculator();

    @Test
    public void testSquareRootPositive(){
        double observed = c.squareRoot(49.0);
        double expected = 7.0;
        assertEquals(observed, expected, 1e-10);
    }

    @Test
    public void testSquareRootEdge(){
        double observed = c.squareRoot(-1.0);
        double expected = Double.NaN;
        assertEquals(observed, expected, 1e-10);
    }

    @Test
    public void testSquareRootPrecision(){
        double observed = c.squareRoot(401.0);
        double expected = 20.024984394500787;
        assertEquals(observed, expected, 1e-10);
    }

    @Test
    public void testNaturalLogPositive(){
        double observed = c.naturalLog(Math.E);
        double expected = 1.0;
        assertEquals(observed, expected, 1e-10);
    }

    @Test
    public void testNaturalLogNegative(){
        double observed = c.naturalLog(-Math.E);
        double expected = Double.NaN;
        assertEquals(observed, expected, 1e-10);
    }

    @Test
    public void testNaturalLogPrecision(){
        double observed = c.naturalLog(1.0);
        double expected = 0.0;
        assertEquals(observed, expected, 1e-10);
    }

    @Test 
    public void testPowerPositive(){
        double observed = c.power(3.0, 2.0);
        double expected = 9.0;
        assertEquals(observed, expected, 1e-10);
    }

    @Test
    public void testPowerNegative(){
        double observed = c.power(2.0, -1);
        double expected = 0.5;
        assertEquals(observed, expected, 1e-10);
    }

    @Test
    public void testPowerPrecision(){
        double observed = c.power(Double.NaN, 100);
        double expected = Double.NaN;
        assertEquals(observed, expected, 1e-10);
    }

    @Test
    public void testFactorialPositive(){
        double observed = c.factorial(5.0);
        double expected = 120.0;
        assertEquals(observed, expected, 1e-10);
    }

    @Test 
    public void testFactorialNegative(){
        double observed = c.factorial(-1.0);
        double expected = Double.NaN;
        assertEquals(observed, expected, 1e-10);
    }

    @Test 
    public void testFactorialPrecision(){
        double observed = c.factorial(0.0);
        double expected = 1.0;
        assertEquals(observed, expected, 1e-10);
    }
}