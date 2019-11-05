/**
 * 
 */
package com.dtw.main.application;

/**
 * @author parnik This Class contains Utilities method to help converting the
 *         Decimal numbers into English Words
 */
public class DigitsToWordUtilities {

	private static final String[] one_digit = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
			"Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
			"Nineteen", "Twenty" };

	private static final String[] two_digit = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy",
			"Eighty", "Ninty" };

	public static String getHundreds(Long inputValue) {
		StringBuilder sb = new StringBuilder(Constants.EMPTY);
		if (inputValue > 100) {
			Long hundredValue = inputValue / 100;
			sb.append(one_digit[hundredValue.intValue()] + Constants.HUNDRED);
			inputValue = inputValue % 100;
		}
		if (inputValue > 20) {
			Long tensValue = inputValue / 10;
			inputValue = inputValue % 10;
			sb.append(two_digit[tensValue.intValue()] + Constants.SPACE + one_digit[inputValue.intValue()]);
		} else {
			sb.append(one_digit[inputValue.intValue()]);
		}

		return sb.toString();
	}

}
