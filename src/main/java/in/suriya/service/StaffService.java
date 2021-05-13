package in.suriya.service;

import java.util.ArrayList;
import java.util.List;

import in.suriya.model.Staff;
import in.suriya.util.Validation;

public class StaffService {
	    private StaffService() {
	    	//Default constructor
	    }
	
	    private  static final List<Staff> staffList = new ArrayList<>();
	    static {
         Staff st1=new Staff(9500500452L,"Suriya1@");
		 Staff st2 = new Staff(9003750359L,"Harish1#");
		 staffList.add(st1);
		 staffList.add(st2);
		}
	   
	   
	   
	   /**checks and validates for credentials
	    * 
	    * @param mobNo
	    * @param password
	    * @return
	    */
	    
		public static boolean validater(String mobNo, String password) {
		boolean exist=false;
		boolean mobNoValid = Validation.mobNoValidater(mobNo);
		boolean passwordValid = Validation.passwordValidater(password);
		
		if(mobNoValid && passwordValid) {
			for (Staff staff : staffList) {
				if (staff.getMobNo() ==Long.valueOf(mobNo) && staff.getPassword().equals(password)) {
					exist = true;
					break;
				}
			}
		}
		
		return exist;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
