package com.dtw.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.dtw.main.application.NumberCreater;

public class NumberCreaterTest {
	
	NumberCreater creater = new NumberCreater();
	
	@Test
	public void getTrillionValueStringTest() {
		assertEquals("One Hundred Twenty Three Trillion ",creater.getTrillionValueString(123456789123456L));
	}
	
	@Test
	public void getBillionValueStringTest() {
		assertEquals("One Hundred Twenty Three Billion ",creater.getBillionValueString(123456789123L));
	}
	@Test
	public void getMillionValueStringTest() {
		assertEquals("One Hundred Twenty Three Million ",creater.getMillionValueString(123456789L));
	}
	@Test
	public void getThousandValueStringTest() {
		assertEquals("One Hundred Twenty Three Thousand ",creater.getThousandValueString(123456L));
	}
	@Test
	public void getHundredValueStringTest() {
		assertEquals("One Hundred And Twenty Three",creater.getHundredValueString(123L));
	}
}
