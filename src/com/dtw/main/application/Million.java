package com.dtw.main.application;

public class Million {
	
	private Long million;
	private String millionValue;
	
	public Million(Long value) {
		setMillion(value);
		setMillionValue(HundredCalculator.calculateThreeDigitString(getMillion(), false));
	}

	/**
	 * @return the million
	 */
	public Long getMillion() {
		return million;
	}

	/**
	 * @param million the million to set
	 */
	public void setMillion(Long million) {
		this.million = million;
	}

	/**
	 * @return the millionValue
	 */
	public String getMillionValue() {
		return millionValue;
	}

	/**
	 * @param millionValue the millionValue to set
	 */
	public void setMillionValue(String millionValue) {
		this.millionValue = millionValue;
	}
	
}
