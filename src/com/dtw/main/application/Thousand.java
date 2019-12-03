package com.dtw.main.application;

public class Thousand {
	
	private Long thousand;
	private String thousandValue;
	
	public Thousand(Long value) {
		setThousand(value);
		setThousandValue(HundredCalculator.calculateThreeDigitString(getThousand(), false));
	}

	/**
	 * @return the thousand
	 */
	public Long getThousand() {
		return thousand;
	}

	/**
	 * @param thousand the thousand to set
	 */
	public void setThousand(Long thousand) {
		this.thousand = thousand;
	}

	/**
	 * @return the thousandValue
	 */
	public String getThousandValue() {
		return thousandValue;
	}

	/**
	 * @param thousandValue the thousandValue to set
	 */
	public void setThousandValue(String thousandValue) {
		this.thousandValue = thousandValue;
	}
	
}
