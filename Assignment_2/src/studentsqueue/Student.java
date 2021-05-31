package studentsqueue;

public class Student {
	
	private int rollNo;
	private String name;
	private int age;
	private String gender;
	private final static String std="11th";
	
	public Student(int rollNo, String name, int age, String gender) {
	
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", gender=" + gender;
	}
	
	
	

}
