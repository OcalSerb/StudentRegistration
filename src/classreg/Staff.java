package classreg;

public class Staff extends Account {
	
	private String staffNRIC;

	public Staff(String accID, String nm, String dep, String userN, String passW, String staffNRIC) {
		
		super(accID,nm,dep, userN, passW);
		this.staffNRIC = staffNRIC;
	}

	
	
	

}
