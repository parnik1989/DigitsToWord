package com.dtw.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dtw.main.application.HundredCalculator;

public class HundredCalculatorTest {
	
	@Test
	public void calculateThreeDigitStringtest() {
		assertEquals("Two Hundred Thirty Four",HundredCalculator.calculateThreeDigitString(234L, false));
	}
	@Test
	public void calculateThreeDigitStringWithAndtest() {
		assertEquals("Two Hundred And Thirty Four",HundredCalculator.calculateThreeDigitString(234L, true));
	}
	
}
