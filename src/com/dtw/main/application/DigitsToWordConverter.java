package com.dtw.main.application;

/**
 * @author parni Class Used to Convert Decimal Numbers to English Words
 */
public class DigitsToWordConverter {

	public String ConvertNumber(Long inputValue, Integer length) {
		StringBuilder sb = new StringBuilder(Constants.EMPTY);
		if (inputValue != null) {
			if (inputValue < 0) {
				sb.append(Constants.NON_NEGATIVE);
			} else if (inputValue == 0) {
				sb.append(Constants.ZERO);
			} else if (length > 15) {
				sb.append(Constants.VALID_INPUT);
			} else {
				while (length > 0) {
					if (length > 12) {
						Long trillionValue = inputValue / 1000000000000L;
						inputValue = inputValue % 1000000000000L;
						sb.append(DigitsToWordUtilities.getHundreds(trillionValue) + Constants.TRILLION);
						length = 12;
					} else if (length > 9) {
						Long billionValue = inputValue / 1000000000L;
						inputValue = inputValue % 1000000000L;
						sb.append(DigitsToWordUtilities.getHundreds(billionValue) + Constants.BILLION);
						length = 9;
					} else if (length > 6) {
						Long millionValue = inputValue / 1000000L;
						inputValue = inputValue % 1000000L;
						sb.append(DigitsToWordUtilities.getHundreds(millionValue) + Constants.MILLION);
						length = 6;
					} else if (length > 3) {
						Long thousandValue = inputValue / 1000L;
						inputValue = inputValue % 1000L;
						sb.append(DigitsToWordUtilities.getHundreds(thousandValue) + Constants.THOUSAND);
						length = 3;
					} else {
						sb.append(DigitsToWordUtilities.getHundreds(inputValue));
						length = 0;
					}
				}
			}
		} else {
			sb.append(Constants.NON_NULL);
		}
		return sb.toString();
	}

}
