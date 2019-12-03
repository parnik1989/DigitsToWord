package com.dtw.main.application;

public class Hundred {
	
	private Long hundred;
	private String hundredValue;
	
	public Hundred(Long value) {
		setHundred(value);
		setHundredValue(HundredCalculator.calculateThreeDigitString(getHundred(),true));
	}

	/**
	 * @return the hundred
	 */
	public Long getHundred() {
		return hundred;
	}

	/**
	 * @param hundred the hundred to set
	 */
	public void setHundred(Long hundred) {
		this.hundred = hundred;
	}

	/**
	 * @return the hundredValue
	 */
	public String getHundredValue() {
		return hundredValue;
	}

	/**
	 * @param hundredValue the hundredValue to set
	 */
	public void setHundredValue(String hundredValue) {
		this.hundredValue = hundredValue;
	}

}
