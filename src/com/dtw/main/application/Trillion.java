package com.dtw.main.application;

public class Trillion {
	
	private Long trillion;
	private String trillionValue;
	
	public Trillion(Long value) {
		setTrillion(value);
		setTrillionValue(HundredCalculator.calculateThreeDigitString(getTrillion(), false));
	}

	/**
	 * @return the trillion
	 */
	public Long getTrillion() {
		return trillion;
	}

	/**
	 * @param trillion the trillion to set
	 */
	public void setTrillion(Long trillion) {
		this.trillion = trillion;
	}

	/**
	 * @return the trillionValue
	 */
	public String getTrillionValue() {
		return trillionValue;
	}

	/**
	 * @param trillionValue the trillionValue to set
	 */
	public void setTrillionValue(String trillionValue) {
		this.trillionValue = trillionValue;
	}

}
