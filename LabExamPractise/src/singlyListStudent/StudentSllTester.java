package singlyListStudent;

import java.util.Scanner;

public class StudentSllTester {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		SinglyLinkedList l1=new SinglyLinkedList();
		
		Student s1;
		boolean exit=false;
		
		while(!exit)
		{
			System.out.println();
			System.out.println("1.AddAtLast:\n"
							+"2.AddAtFirst:\n"
							+ "3.RemoveFromLast:\n"
							+ "4.RemoveFromFirst:\n"
							+ "5.AddByPosition:\n"
							+ "6.RemoveByPosition:\n"
							+ "7.searchStudentByRollNo:\n"
							+ "8.display\n"
							+ "9.exit\n");
			
			System.out.println("Enter your choice:");
			int choice=sc.nextInt();
			
			switch (choice) {
							case 1:
								System.out.println("enter the students details:");
								System.out.println("enter the roll no:");
								int roll=sc.nextInt();
								System.out.println("enter the name:");
								String name=sc.next();
								System.out.println("enter the dept name:");
								String dept=sc.next();
								s1=new Student(roll, name, dept);
								l1.addAtLast(s1);
								break;
				
							case 2:
								System.out.println("enter the students details:");
								System.out.println("enter the roll no:");
								int r=sc.nextInt();
								System.out.println("enter the name:");
								String n=sc.next();
								System.out.println("enter the dept name:");
								String d=sc.next();
								s1=new Student(r, n, d);
								l1.addAtFirst(s1);
								break;
							
							case 3:l1.removeFromLast();
								
								break;
				
							case 4:l1.removeFromFirst();
								break;
								
							case 5:
								System.out.println("enter the position that you want to add student details:");
							    int pos=sc.nextInt();
								System.out.println("enter the students details:");
								System.out.println("enter the roll no:");
								int a=sc.nextInt();
								System.out.println("enter the name:");
								String b=sc.next();
								System.out.println("enter the dept name:");
								String c=sc.next();
								s1=new Student(a, b, c);
								l1.addByPosition(pos,s1);
								
								break;
				
							case 6:
								System.out.println("enter the position to remove student:");
								int pos1=sc.nextInt();
								l1.removeByPosition(pos1);
							
								break;
								
							case 7:
								System.out.println("enter the roll no of student to find:");
								int roll_no=sc.nextInt();
								System.out.println();
								Student student = l1.searchStudentByRollNo(roll_no);
								if(student==null)
								{
									System.out.println("Student details not fount Invalid roll number!!!");
								}
								else
								{
									System.out.println("found student details:");
									System.out.println(student);
								}

								break;
				
							case 8:
								l1.display();
								break;
							
							case 9:
								exit=true;
								break;
				
							
			}
		}
		
	}

}
