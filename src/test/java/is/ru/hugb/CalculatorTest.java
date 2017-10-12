package is.ru.Calculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class	CalculatorTest	{

	@Test
	public void testEmptyString() {
			assertEquals(0, Calculator.add(""));
	}
	@Test
	public void testOneNumber() {
			assertEquals(1, Calculator.add("1"));
	}
	@Test
	public void testTwoNumbers() {
			assertEquals(3, Calculator.add("1,2"));
	}
	@Test
	public void testMultipleNumbers() {
			assertEquals(6, Calculator.add("1,2,3"));
	}
	@Test
	public void testMultipleNumbersLineSeperator() {
			assertEquals(6, Calculator.add("1\n2,3"));
	}
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeNumber() {
			assertEquals("Negatives not allowed:-1", Calculator.add("-1,2,3"));
	}
	@Test
	public void numberOver1000() {
			assertEquals(2, Calculator.add("1001,2"));
	}
	@Test
	public void funkyDelimeter() {
			assertEquals(3, Calculator.add("//;\n1;2"));
	}
}
