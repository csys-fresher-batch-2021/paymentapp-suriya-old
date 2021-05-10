package in.suriya.validater;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

	
	/**
	 * Mobile Number Checker(10-digit number)
	 * 
	 * @param mobNo
	 * @return
	 */
	
	public static boolean mobNoValidater(String mobNo) {
		boolean isMobNoValid=false;
		try {
			long mobNumber = Long.parseLong(mobNo);
			String check = "^([9][1])?[6-9]\\d{9}$";
			Pattern p = Pattern.compile(check);
			Matcher m = p.matcher(String.valueOf(mobNumber));
			if (m.matches()) {
				isMobNoValid = true;
			}
		} catch (Exception e) {
			isMobNoValid = false;
		}
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
		boolean isPassValid = false;
		if ((password == null) || (password.trim().equals(""))) {
			return isPassValid;
		}
		String check = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,16}$";
		Pattern p = Pattern.compile(check);
		Matcher m = p.matcher(password);
		if (m.matches()) {
			isPassValid = true;
		}
		return isPassValid;
	}
	
}
