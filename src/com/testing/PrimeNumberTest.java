package com.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeNumberTest {
	PrimeNumber p=new PrimeNumber();

	@Test
	public void testPrime1() {
		assertEquals(2,p.Prime(1));
	}
	@Test
	public void testPrime2() {
		assertEquals(3,p.Prime(2));
	}
	@Test
	public void testPrime3() {
		assertEquals(5,p.Prime(3));
	}
	@Test
	public void testPrime4() {
		assertEquals(7,p.Prime(4));
	}
	@Test
	public void testPrime5() {
		assertEquals(11,p.Prime(5));
	}
	@Test
	public void testPrime6() {
		assertEquals(13,p.Prime(6));
	}
	@Test
	public void testPrime7() {
		assertEquals(17,p.Prime(7));
	}
	@Test
	public void testPrime8() {
		assertEquals(19,p.Prime(8));
	}
	@Test
	public void testPrime9() {
		assertEquals(23,p.Prime(9));
	}
	@Test
	public void testPrime30() {
		assertEquals(113,p.Prime(30));
	}

}
