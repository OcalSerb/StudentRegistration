package classreg;

import java.util.*;
import classreg.Staff;
import classreg.Student; 

public class DataStorage {
	
	List<Account> staff = new ArrayList<Account>();
	List<Account> student = new ArrayList<Account>();
	
	
	public DataStorage() {
		
	}
	
	public void addStaff(Staff sf) {
		staff.add(sf);
	}
	
	public void addStudent(Student su) {
		student.add(su);
	}
	
	public Staff getStaff(Staff sf) {
		return sf;
	}
	
	public Student getStudent(Student su) {
		return su;
	}
}
