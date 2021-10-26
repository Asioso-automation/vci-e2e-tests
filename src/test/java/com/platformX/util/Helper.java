package com.platformX.util;

import java.util.Random;
import java.util.UUID;

public class Helper {

	public static String getRandomString(int n) {
		return UUID.randomUUID().toString().substring(0, n);
	}

	public static String getRandomEmailAddress(String email) {
		return email.split("@")[0] + "+" + UUID.randomUUID().toString().substring(0, 3) + "@" + email.split("@")[1];
	}

	public static String getRandomNumber(int randomNumbersCount) {
		String random = "";
		int[] randomNumbers = new int[randomNumbersCount];
		Random number = new Random();
		for (int i = 0; i < randomNumbersCount; i++) {
			randomNumbers[i] = number.nextInt(8) + 1;
		}
		for (int j = 0; j < randomNumbers.length; j++) {
			random += randomNumbers[j];
		}
		return random;
	}

}