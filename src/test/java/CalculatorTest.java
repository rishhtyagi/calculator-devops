import org.junit.Test;
import static org.junit.Assert.*;
import calc.calcDevops;

public class CalculatorTest {

    private static final double DELTA = 1e-9;
	calcDevops calculator = new calcDevops();
	
	@Test
	    public void testSqrRoot_true() {
	        assertEquals("True: Square Root", 5.0, calculator.sqrRoot(25.0), DELTA);
//	        assertEquals("True: Square Root", Double.NaN, calculator.sqrRoot(-15.0), DELTA);
	        assertEquals("True: Square Root", 10.0, calculator.sqrRoot(100.0), DELTA);
	        assertEquals("True: Square Root", 9.486832980505138, calculator.sqrRoot(90.0), DELTA);
	    }
	    
	    @Test
	    public void testSqrRoot_false() {
	    
	    assertNotEquals("False: Square Root", 10.0, calculator.sqrRoot(90), DELTA);
	    	    assertNotEquals("False: Square Root", 5.0, calculator.sqrRoot(26), DELTA);
//        assertNotEquals("False: Square Root", 1.0, calculator.sqrRoot(-7), DELTA);
	    }
		
		@Test
		public void testFactorial_true() {
		assertEquals("True: Factorial (True positive)", 6.0, calculator.factorial(3), DELTA);
	        assertEquals("True: Factorial (True positive)", 3628800.0 , calculator.factorial(10), DELTA);
	        assertEquals("True: Factorial (True positive)", 1.0, calculator.factorial(0), DELTA);
			assertEquals("True: Factorial (True positive)", 1.0, calculator.factorial(-6), DELTA);
		}
		
		@Test
		public void testFactorial_false() {
		assertNotEquals("False: Factorial (False positive)", 9.0, calculator.factorial(3), DELTA);
			assertNotEquals("False: Factorial (False positive)", 36288009.0 , calculator.factorial(10), DELTA);
			assertNotEquals("False: Factorial (False positive)", -1.0, calculator.factorial(-6), DELTA);
		}
		
		@Test
		public void testLogarithm_true() {
		assertEquals("True: Logarithm (True positive)", 0.99325177301, calculator.logarithm(2.7), DELTA);
        assertEquals("True: Logarithm (True positive)", 2.30258509299 , calculator.logarithm(10.0), DELTA);
        assertEquals("True: Logarithm (True positive)", 0.0, calculator.logarithm(1.0), DELTA);
		}
		
		@Test
		public void testLogarithm_false() {
			assertNotEquals("False: Logarithm (False positive)", 2.0, calculator.logarithm(10.0), DELTA);
			assertNotEquals("False: Logarithm (False positive)", 2.0 , calculator.logarithm(0.0), DELTA);
			assertNotEquals("False: Logarithm (False positive)", 1.0, calculator.logarithm(1.0), DELTA);
		}
		
		@Test
		public void testPower_true() {
		assertEquals("True: Power (True positive)", 16.0,  calculator.power(2,4), DELTA);
		assertEquals("True: Power (True positive)", 0.0,  calculator.power(0,1), DELTA);
		assertEquals("True: Power (True positive)", Double.NaN,  calculator.power(-2,0.121), DELTA);
		}
		
		@Test
		public void testPower_false() {
		assertNotEquals("False: Power (False positive)", 1.0,  calculator.power(2,4), DELTA);
		assertNotEquals("False: Power (False positive)", 1.0,  calculator.power(0,1), DELTA);
		assertNotEquals("False: Power (False positive)", 1.0,  calculator.power(-3,2), DELTA);
		}
}
