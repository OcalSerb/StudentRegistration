package classreg;

public class Account {
	
	private String accountID;
	private String name;
	private String department;
	private String userName;
	private String password;

	
	public Account(String accID, String nm, String dep, String userN, String passW) {
		super();
		
		this.accountID = accID;
		this.name = nm;
		this.department = dep;
		this.userName = userN;
		this.password = passW;
	}


	
	public String getAccountID() {
		return accountID;
	}


	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}




	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	

}
