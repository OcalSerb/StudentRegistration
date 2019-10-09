package classreg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StaffTest {
	
	/*
	//This test should be successful, as all argument are correct
	@Test
	public void testCreateStaff() {
		
		String accID = "0900";
		String nm ="Serb";
		String dep = "Maps";
		String userN = "serb";
		String passW =  "123";
		String staffNRIC = "xyz";
		
		new Staff(accID, nm, dep, userN, passW, staffNRIC) ;
	}	
	*/
	// This test should throw an IllegalArgumentException, as the name is required.	
	
	@Test
	public void testCreateStaffMemberNameNull() {
	
		String accID = "0900";
		String nm = "";
		String dep = "Maps";
		String userN = "serb";
		String passW =  "123";
		String staffNRIC = "xyz";
		
		new Staff(accID, nm, dep, userN, passW, staffNRIC) ;
	}

	
}
