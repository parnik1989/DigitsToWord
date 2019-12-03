package com.dtw.main.application;

import java.util.Scanner;

/**
 * @author Parnik Main Application class to start the application -- It takes the input form standard input and respond with relevant output
 */
public class DigitToWordsApplication {

	public static void main(String[] args) throws InterruptedException {
		while (true) {
			boolean validInput = false;
			while (!validInput) {
				System.out.print("Please Enter a Number: ");
				try {
					@SuppressWarnings("resource")
					String inputString = new Scanner(System.in).nextLine();
					if (inputString.length() <= 15) {
						validInput = true;
						Long inputValue = Long.parseLong(inputString);
						DigitsToWordConverter dtwc = new DigitsToWordConverter();
						System.out.println(dtwc.ConvertNumber(inputValue, inputString.length()));
					} else {
						throw new Exception();
					}
				} catch (Exception e) {
					System.out.println(Constants.VALID_INPUT);
					Thread.sleep(2000);
				}
			}
		}
	}

}
