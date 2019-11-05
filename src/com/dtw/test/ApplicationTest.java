package com.dtw.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.dtw.main.application.DigitsToWordConverter;

public class ApplicationTest {

	DigitsToWordConverter converter = new DigitsToWordConverter();

	@Before
	public void steUp() {
		converter = new DigitsToWordConverter();
	}

	@Test
	public void testOneDigitNumberSuccess() {
		assertEquals("Zero", converter.ConvertNumber(0L, 1));
	}

	@Test
	public void testTwoDigitNumberSuccess() {
		assertEquals("Twenty Five", converter.ConvertNumber(25L, 2));
	}

	@Test
	public void testThreeDigitNumberSuccess() {
		assertEquals("One Hundred Twenty One", converter.ConvertNumber(121L, 3));
	}

	@Test
	public void testThousandNumberSuccess() {
		assertEquals("Three Thousand One Hundred Twenty One", converter.ConvertNumber(3121L, 4));
	}

	@Test
	public void testMillionNumberSuccess() {
		assertEquals("One Million Three Hundred Twelve Thousand One Hundred Twenty One",
				converter.ConvertNumber(1312121L, 7));
	}

	@Test
	public void testBillionNumberSuccess() {
		assertEquals("Nine Billion Nine Hundred Ninty One Million Three Hundred Twelve Thousand One Hundred Twenty One",
				converter.ConvertNumber(9991312121L, 10));
	}

	@Test
	public void testTrillionNumberSuccess() {
		assertEquals(
				"One Trillion Two Hundred Thirty Nine Billion Nine Hundred Ninty One Million Three Hundred Twelve Thousand One Hundred Twenty One",
				converter.ConvertNumber(1239991312121L, 13));
	}

	@Test
	public void testNegativeNumberSuccess() {
		assertEquals("Please enter a non-negative value", converter.ConvertNumber(-121L, 3));
	}

	@Test
	public void testUndefinedNumberSuccess() {
		assertEquals("Please try again and pass a valid input.", converter.ConvertNumber(12399913121211234L, 16));
	}

}
