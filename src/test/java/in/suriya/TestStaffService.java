package in.suriya;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import in.suriya.service.StaffService;

public class TestStaffService {

	 @Test
     public void testStudentValidate() {
        boolean isvalid=StaffService.validater("9003750359","Harish1#");
        assertEquals(true,isvalid);
	 }
}
