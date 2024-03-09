package telran.numbers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testSum() {
		
		assertEquals(4.0, Calculator.sum(2, 2));
		assertEquals(0, Calculator.sum(2, -2));
		assertEquals(-2.5, Calculator.sum(2, -4.5));
	}

	@Test
	void testSubtract() {
		assertEquals(0, Calculator.subtract(2, 2));
		assertEquals(3, Calculator.subtract(5, 2));
		assertEquals(-3, Calculator.subtract(2, 5));
	}

	@Test
	void testMultiply() {
		assertEquals(4.0, Calculator.multiply(2, 2));
		assertEquals(8.0, Calculator.multiply(2, 4));
		assertEquals(-4.0, Calculator.multiply(2, -2));
	}

	@Test
	void testDivide() {
		assertEquals(1.0, Calculator.divide(2, 2));
		assertEquals(2.0, Calculator.divide(4, 2));
		assertEquals(-1.0, Calculator.divide(2, -2));
		assertEquals(Double.NEGATIVE_INFINITY,Calculator.divide(-5,0));
		assertEquals(Double.POSITIVE_INFINITY,Calculator.divide(5,0));
		assertEquals(-2.5, Calculator.divide(-5, 2));
		assertEquals(2.5, Calculator.divide(-5, -2));
	}

}
