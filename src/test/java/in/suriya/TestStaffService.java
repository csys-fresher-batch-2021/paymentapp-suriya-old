package in.suriya;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import in.suriya.service.staff.StaffLoginAndRegisterService;

public class TestStaffService {

	 @Test
     public void testStudentValidate() throws Exception {
       String name=StaffLoginAndRegisterService.staffValidater(9003750359L,"Harish1#");
       assertNotNull(name);
       }
	 
	 @Test
     public void testStudentValidate1() throws Exception {
       String name=StaffLoginAndRegisterService.staffValidater(9003750349L,"Harish1#");
       assertNull(name);
       }
	 
/*	 @Test
     public void testStudentValidate2() throws Exception {
       String name=StaffLoginAndRegisterService.staffValidater(7003750359L,"Harish1#");
       assertEquals("Invalid MobileNo Format",getMessage());
       }*/
	
	 
	 
	@Test
     public void testRegisterStaff() throws Exception {
       boolean register=StaffLoginAndRegisterService.registerStaff("vijay",9345535935L,"Vijay3#sd");
       assertTrue(register);
       }
	
	@Test
    public void testRegisterStaff1() throws Exception {
      boolean register=StaffLoginAndRegisterService.registerStaff("suriya",9500500452L,"Suriya1@");
      assertFalse(register);
      }
}

