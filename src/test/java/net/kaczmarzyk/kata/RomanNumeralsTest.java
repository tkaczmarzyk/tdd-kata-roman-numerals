package net.kaczmarzyk.kata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class RomanNumeralsTest {

	RomanNumeralConverter converter = new RomanNumeralConverter();
	
	@Test
	public void convertsToSingleI() {
		assertEquals("I", converter.convert(1));
	}
}
