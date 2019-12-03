package com.dtw.main.application;

public class Billion {
	
	private Long billion;
	private String billionValue;
	
	public Billion(Long value) {
		setBillion(value);
		setBillionValue(HundredCalculator.calculateThreeDigitString(getBillion(), false));
	}

	/**
	 * @return the billion
	 */
	public Long getBillion() {
		return billion;
	}

	/**
	 * @param billion the billion to set
	 */
	public void setBillion(Long billion) {
		this.billion = billion;
	}

	/**
	 * @return the billionValue
	 */
	public String getBillionValue() {
		return billionValue;
	}

	/**
	 * @param billionValue the billionValue to set
	 */
	public void setBillionValue(String billionValue) {
		this.billionValue = billionValue;
	}

}
