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

import java.util.Arrays;
import java.util.List;

public class RomanNumeralConverter {

	private List<RomanSymbol> symbols = Arrays.asList(
		new RomanSymbol(1000, "M"),
		new RomanSymbol(500, "D"),
		new RomanSymbol(100, "C"),
		new RomanSymbol(50, "L"),
		new RomanSymbol(10, "X"),
		new RomanSymbol(5, "V"),
		new RomanSymbol(1, "I")
	);
	
	public String convert(int val) {
		StringBuilder result = new StringBuilder();
		
		for (RomanSymbol symbol : symbols) {
			result.append(symbol.maxRepetitionLessOrEqualTo(val));
			val -= symbol.maxRepetitionValueLessOrEqualTo(val);
		}
		
		return result.toString();
	}
}
