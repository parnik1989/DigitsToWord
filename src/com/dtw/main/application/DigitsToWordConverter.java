package com.dtw.main.application;

/**
 * @author parnik Class Used to Convert Decimal Numbers to English Words
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
				NumberCreater creater = new NumberCreater();
				while (length > 0 && inputValue > 0) {
					if (length > 12) {
						sb.append(creater.getTrillionValueString(inputValue));
						inputValue = inputValue % Constants.ONE_TRILLION;
						length = 12;
					} else if (length > 9) {
						sb.append(creater.getBillionValueString(inputValue));
						inputValue = inputValue % Constants.ONE_BILLION;
						length = 9;
					} else if (length > 6) {
						sb.append(creater.getMillionValueString(inputValue));
						inputValue = inputValue % Constants.ONE_MILLION;
						length = 6;
					} else if (length > 3) {
						sb.append(creater.getThousandValueString(inputValue));
						inputValue = inputValue % Constants.ONE_THOUSAND;
						length = 3;
					} else {
						sb.append(creater.getHundredValueString(inputValue));
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
