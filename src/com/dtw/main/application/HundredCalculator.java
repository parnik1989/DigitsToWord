/**
 * 
 */
package com.dtw.main.application;

import org.junit.platform.commons.util.StringUtils;

/**
 * @author parnik This Class contains Utilities method to help converting the
 *         Decimal numbers into English Words
 */
public class HundredCalculator {

	public static String calculateThreeDigitString(Long inputValue, boolean lastValue) {
		StringBuilder sb = new StringBuilder(Constants.EMPTY);
		if (inputValue >= 100) {
			sb.append(NumberToStringCalculator.calculateSingleDigitString(inputValue / 100) + Constants.HUNDRED);
			inputValue = inputValue % 100;
		}
		if (lastValue && inputValue > 0 && StringUtils.isNotBlank(sb.toString())) {
			sb.append(Constants.AND);
		}
		if (inputValue > 20) {
			sb.append(NumberToStringCalculator.calculateDoubleDigitString(inputValue / 10) + Constants.SPACE + NumberToStringCalculator.calculateSingleDigitString(inputValue % 10));
		} else {
			sb.append(NumberToStringCalculator.calculateSingleDigitString(inputValue));
		}

		return sb.toString();
	}
	
	
}
