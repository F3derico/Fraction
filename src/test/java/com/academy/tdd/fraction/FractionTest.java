package com.academy.tdd.fraction;

import org.hamcrest.core.AnyOf;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.internal.matchers.Any;

import com.academy.tdd.fraction.Fraction;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FractionTest {

	@BeforeClass
	public static void setupOnceAtStartup() {
		// System.out.println("Execute this only once...");
	}

	@Before
	public void setupBeforeEach() {
		/*
		 * System.out.println("Before each test...");
		 * System.out.println("Before each test...");
		 */
	}

	@After
	public void teardownAfterEach() {
		// System.out.println("After each test...");
	}

	@After
	public void settingNullCriticalObject() {
		/*
		 * System.out.println("Setting null that");
		 * System.out.println("Setting null that");
		 * System.out.println("Setting null that");
		 */
	}

	@Test
	public void shouldCreateFraction() {
		Fraction a = new Fraction(2, 3);
		assertEquals(2, a.getNum());
		assertEquals(3, a.getDen());
	}

	@Test(expected = ArithmeticException.class)
	public void shouldnotAccept() {
		Fraction a = new Fraction(2, 0);
	}

	@Test
	public void reciprocalTest() {
		Fraction a = new Fraction(2, 3).getReciprocal();
		assertEquals(3, a.getNum());
		assertEquals(2, a.getDen());
	}

	@Test(expected = ArithmeticException.class)
	public void reciprocalTestWithException() {
		Fraction a = new Fraction(0, 3).getReciprocal();
	}

	@Test
	public void testProduct() {
		Fraction a = new Fraction(2, 3);
		assertEquals("2/3", a.toString());
		assertEquals("3/2", a.getReciprocal().toString());
	}

	@Test
	public void testDivide() {
		Fraction a = new Fraction(2, 3);
		Fraction b = new Fraction(3, 2);
		assertEquals("4/9", Fraction.divide(a, b).toString());
	}

	@Test(expected = ArithmeticException.class)
	public void testDivideException() {
		Fraction a = new Fraction(2, 3);
		Fraction b = new Fraction(0, 2);
		Fraction.divide(a, b);
	}

	@Test
	public void testSum() {
		Fraction a = new Fraction(2, 3);
		Fraction b = new Fraction(3, 2);
		assertEquals("13/6", Fraction.sum(a, b).toString());
	}

	@Test
	public void testSubtract() {
		Fraction a = new Fraction(5, 3);
		Fraction b = new Fraction(2, 5);
		assertEquals("19/15", Fraction.subtract(a, b).toString());
	}

	@Test
	public void testReduce() {
		Fraction a = new Fraction(3, 9);
		a.reduce();
		assertEquals("1/3", a.toString());
	}
	
	@Test
	public void testcompareTo() {
		Fraction a = new Fraction(3, 9);
		Fraction b = new Fraction(1, 3);
		Fraction c = new Fraction(2, 3);
		Fraction d = new Fraction(1, 4);

		assertEquals(0, a.compareTo(b));
		assertEquals(1, c.compareTo(b));
		assertEquals(-1, d.compareTo(b));
	}

}