package in.suriya.service;

import java.util.ArrayList;


import in.suriya.model.Staff;
import in.suriya.validater.Validation;

public class StaffService {
	public static ArrayList<Staff> staffList = new ArrayList<Staff>(); // to store staff data in
	// staffDetail class

// Default staff Details
	static {
		Staff st1 = new Staff();
		st1.mobNo = 9500500452L;
		st1.password = "Suriya1@";

		Staff st2 = new Staff();
		st2.mobNo = 9003750359L;
		st2.password = "Harish1#";

		staffList.add(st1);
		staffList.add(st2);
	}

	public static boolean validate(String mobNo, String password) {
		boolean mobNoValid = Validation.mobNoValidater(mobNo);
		boolean passwordValid = Validation.passwordValidater(password);
		boolean exist = false;
		if (!mobNoValid || !passwordValid) {
			return exist;
		}
		if (mobNo.length() <= 11) {
			long mobileNo = Long.valueOf(mobNo);
			exist = validates(mobileNo, password);
		} else {
			long mobileNo = Long.valueOf(mobNo.substring(2));
			exist = validates(mobileNo, password);
		}

		return exist;
	}

	public static boolean validates(long mobNo, String password) {
		boolean exist = false;
		for (Staff staff : staffList) {
			if (staff.mobNo == mobNo && staff.password.equals(password)) {
				exist = true;
				break;
			}
		}
		return exist;
	}

}
