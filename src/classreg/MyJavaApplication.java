package classreg;

public class MyJavaApplication {
	
	public static void main (String args[]) {
		
		//RegistrationForm regForm = new RegistrationForm();
		//regForm.dropCourse(102, 1234);
		
		DataStorage ds = new DataStorage();
		
		//staff 
		Staff sf = new Staff("0900","Serb","Maps","serb","123","xyz");
	    ds.addStaff(sf);
	    
	    Student su = new Student("0900","Serb","Maps","serb","123","xyz");
	    ds.addStudent(su);
	    
	    System.out.println(ds.getStaff(sf));
	    System.out.println(ds.getStudent(su));
	}

}
