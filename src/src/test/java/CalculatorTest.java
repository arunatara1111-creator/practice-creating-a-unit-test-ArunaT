import org.example.Calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator= new Calculator();
    int result;
    @Test
    public void testAdd() {

        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }
    @Test
    public void testSubtract() {

        result =calculator.sub(5,2);
        assertEquals(3, result);
    }
    @Test
    public void testMultiply() {
        result = calculator.mul(5,2);
        assertEquals(10, result);
    }
    @Test
    public void testDivide() {
        String msg = "Checking for division";
        double result1 = calculator.div(5.0,2.0);
        assertEquals(2.5, result1 , 0);
    }

}

