/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Tomasz Kaczmarzyk
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package net.kaczmarzyk.kata;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class RomanNumeralsTest {

	RomanNumeralConverter converter = new RomanNumeralConverter();
	
	@Test
	public void convertsToSingleI() {
		assertEquals("I", converter.convert(1));
	}
	
	@Test
	public void convertsToSingleV() {
		assertEquals("V", converter.convert(5));
	}
	
	@Test
	public void convertsToSingleX() {
		assertEquals("X", converter.convert(10));
	}
	
	@Test
	public void convertsToSingleL() {
		assertEquals("L", converter.convert(50));
	}
	
	@Test
	public void convertsToSingleC() {
		assertEquals("C", converter.convert(100));
	}
	
	@Test
	public void convertsToSingleD() {
		assertEquals("D", converter.convert(500));
	}
	
	@Test
	public void convertsToSingleM() {
		assertEquals("M", converter.convert(1000));
	}

	@Test
	public void repeatsASymbol() {
		assertEquals("II", converter.convert(2));
		assertEquals("XX", converter.convert(20));
		assertEquals("III", converter.convert(3));
	}
	
	@Test
	public void combinesMultipleSymbols() {
		assertEquals("XV", converter.convert(15));
		assertEquals("CLX", converter.convert(160));
	}
}
