import org.example.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest{
    Calculator c = new Calculator();

    @Test
    public void sampleTest(){
        double observed = c.add(3.0, 2.0);
        double expected =  5.0;
        assertEquals(observed, expected, 1e-10);
    }
}