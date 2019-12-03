package com.dtw.main.application;

import org.junit.platform.commons.util.StringUtils;

public class NumberCreater {

	public String getTrillionValueString(Long inputValue) {
		Trillion trillion = new Trillion(inputValue / Constants.ONE_TRILLION);
		return StringUtils.isBlank(trillion.getTrillionValue()) ? Constants.EMPTY : trillion.getTrillionValue() + Constants.TRILLION;
	}

	public String getBillionValueString(Long inputValue) {
		Billion billion = new Billion(inputValue / Constants.ONE_BILLION);
		return StringUtils.isBlank(billion.getBillionValue()) ? Constants.EMPTY : billion.getBillionValue() + Constants.BILLION;
	}

	public String getMillionValueString(Long inputValue) {
		Million million = new Million(inputValue / Constants.ONE_MILLION);
		return StringUtils.isBlank(million.getMillionValue()) ? Constants.EMPTY : million.getMillionValue() + Constants.MILLION;
	}

	public String getThousandValueString(Long inputValue) {
		Thousand thousand = new Thousand(inputValue/Constants.ONE_THOUSAND);
		return StringUtils.isBlank(thousand.getThousandValue()) ? Constants.EMPTY : thousand.getThousandValue() + Constants.THOUSAND;
	}
	public String getHundredValueString(Long inputValue) {
		Hundred hundred = new Hundred(inputValue);
		return StringUtils.isBlank(hundred.getHundredValue()) ? Constants.EMPTY : hundred.getHundredValue();
	}

}
