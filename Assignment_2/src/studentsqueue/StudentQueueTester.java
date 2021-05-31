package studentsqueue;

import java.util.Scanner;

public class StudentQueueTester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StudentsQueue q1 = new StudentsQueue();

		boolean exit = false;

		while (!exit) {
			System.out.println("1.Insert the Students:\n" + 
								"2.Remove student:\n" + 
								"3.display Students:\n" +
								"4.exit");

			System.out.println("enter your choice::\n");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter the students details::");
				System.out.println("Enter the roll no::");
				int roll = sc.nextInt();
				System.out.println("Enter the name::");
				String name = sc.next();
				System.out.println("Enter age ::");
				int age = sc.nextInt();
				System.out.println("Enter gender::");
				String gender = sc.next();
				Student s1 = new Student(roll, name, age, gender);
				q1.insert(s1);
				break;

			case 2:
				q1.remove();
				break;

			case 3:
				System.out.println(q1);
				
				break;

			case 4:
				exit = true;
				break;
				
			default:
					System.out.println("plz give valid input!!!!!!!!!!!!!!");
				break;

			}

		}

	}

}
