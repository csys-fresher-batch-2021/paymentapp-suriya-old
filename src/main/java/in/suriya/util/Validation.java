package in.suriya.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
	private Validation() {
		//default constructor
	}

	
	/**
	 * Mobile Number Checker(10-digit number)
	 * 
	 * @param mobNo
	 * @return
	 */
	
	public static boolean mobNoValidater(String mobNo) {
		boolean isMobNoValid=false;
	    String check = "^([9][1])?[6-9]\\d{9}$";
		Pattern p = Pattern.compile(check);
		Matcher m = p.matcher(mobNo);
	    isMobNoValid = m.matches();
	
		return isMobNoValid;
	}
	
	

	/**
	 * Password Checker-password format((0-9)(a-z)(A-Z)[@#$%])
	 * 
	 * 
	 * @param password
	 * @return
	 */
	
	public static boolean passwordValidater(String password) {
		boolean isPassValid;
		String check = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,16}$";
		Pattern p = Pattern.compile(check);
		Matcher m = p.matcher(password);
	    isPassValid = m.matches();
	    
		return isPassValid;
	}
	
}
