package com.dtw.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dtw.main.application.NumberToStringCalculator;

public class NumberToStringCalculatorTest {
	
	@Test
	public void calculateDoubleDigitStringTest() {
		assertEquals("Fifty",NumberToStringCalculator.calculateDoubleDigitString(5L));
	}
	@Test
	public void calculateSingleDigitStringTest() {
		assertEquals("Four",NumberToStringCalculator.calculateSingleDigitString(4L));
	}
	
}
