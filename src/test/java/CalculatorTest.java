import org.example.Calculator;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest{
    Calculator c = new Calculator();

    @Test
    public void testAdd(){
        double observed = c.add(3.0, 2.0);
        double expected =  5.0;
        assertEquals(observed, expected, 1e-10);
    }

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
}