package calculator;

import static org.junit.Assert.*;

import org.junit.*;

public class CalculatorTest {

		private calcDevops calculator;
	    
	    @Before
	    public void setUp() {
	        calculator = new calcDevops();
	    }

		@Test
	    public void testSqrRoot() {
	        double a = 101;
	        double expectedResult = 10.0498756;
	        double result = calculator.sqrRoot(a);
	        Assert.assertEquals(expectedResult, result, 2);
	    }
		
		@Test
		public void testFactorial() {
		double a = 10;
	        double expectedResult = 3628800;
	        double result = calculator.factorial(a);
	        Assert.assertEquals(expectedResult, result, 0);
		}
		
		@Test
		public void testLogarithm() {
		double a = 10;
	        double expectedResult = 1;
	        double result = calculator.logarithm(a);
	        Assert.assertEquals(expectedResult, result, 0);
		}
		
		@Test
		public void testPower() {
		double a = 2;
		double b = -1;
	        double expectedResult = 0.5;
	        double result = calculator.power(a, b);
	        Assert.assertEquals(expectedResult, result, 1);
		}
		
		@Test(expected = IllegalArgumentException.class)
	    	public void testSqrRootOfNegative() {
	        int a = -2;
	        calculator.sqrRoot(a);
	    }
}
