package com.dtw.main.application;

public class NumberToStringCalculator {
	
	private static final String[] ONE_DIGIT = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
			"Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
			"Nineteen", "Twenty" };

	private static final String[] TWO_DIGIT = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy",
			"Eighty", "Ninty" };
	

	public static String calculateSingleDigitString(Long value) {
		
		return ONE_DIGIT[value.intValue()];
	}
	public static String calculateDoubleDigitString(Long value) {
		
		return TWO_DIGIT[value.intValue()];
	}


}
