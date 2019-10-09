package classreg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DataStorageTest {

	@Test
	public void testAddStaffMembers() {
		DataStorage ds = new DataStorage();
		ds.addStaff(createSerb());
	}
	
	Staff createSerb() {
		
		String accID = "0900";
		String nm ="Serb";
		String dep = "Maps";
		String userN = "serb";
		String passW =  "123";
		String staffNRIC = "xyz";
		
        return new Staff(accID,nm,dep,userN, passW, staffNRIC);
    }

}
