package com.app.util;

import java.util.Random;
import java.util.UUID;

public class Helper {

	public static String getRandomString(int n) {
		return UUID.randomUUID().toString().substring(0, n);
	}

	public static String getRandomEmailAddress(String email) {
		return email.split("@")[0] + "+" + UUID.randomUUID().toString().substring(0, 3) + "@" + email.split("@")[1];
	}

	

	public static String getRandomStringCharts(int n) {
        String charts = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < n) { 
            int index = (int) (rnd.nextFloat() * charts.length());
            salt.append(charts.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
	}
        
     public static String getRandomNubmer1to8(int n) {
    	 String charts = "12345678";
    	 StringBuilder salt = new StringBuilder();
    	 Random rnd = new Random();
    	 while (salt.length() < n) { 
    		 int index = (int) (rnd.nextFloat() * charts.length());
    		 salt.append(charts.charAt(index));
    	 }
    	 String saltStr = salt.toString();
    	 return saltStr;    
    }
	
     public static String getRandomNubmer1to4(int n) {
    	 String charts = "1234";
    	 StringBuilder salt = new StringBuilder();
    	 Random rnd = new Random();
    	 while (salt.length() < n) { 
    		 int index = (int) (rnd.nextFloat() * charts.length());
    		 salt.append(charts.charAt(index));
    	 }
    	 String saltStr = salt.toString();
    	 return saltStr;    
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

	public static String getRandomNumberInRange(int min, int max) {
		int range = (max - min) + 1;
		int number = (int) (Math.random() * range) + min;
		String random = String.valueOf(number);
		return random;
	}
}