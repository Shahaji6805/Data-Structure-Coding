package singlyListStudent;

public class Student {
	
	int roll_No;
	String name;
	String deptName;
	
	
	public Student(int roll_No, String name, String deptName) {

		this.roll_No = roll_No;
		this.name = name;
		this.deptName = deptName;
	}

	

	public int getRoll_No() {
		return roll_No;
	}



	@Override
	public String toString() {
		return "roll_No=" + roll_No + ", name=" + name + ", deptName=" + deptName ;
	}
	
	
	
}
