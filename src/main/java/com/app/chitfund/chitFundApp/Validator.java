package com.app.chitfund.chitFundApp;

public class Validator {
	
	
	
	
	public static boolean isMobileNumberValid(String mobile) {
		
		 String regex = "(0/91)?[7-9][0-9]{9}";
		 boolean isMatched = mobile.matches(regex);
 
		return isMatched;
	}

}
