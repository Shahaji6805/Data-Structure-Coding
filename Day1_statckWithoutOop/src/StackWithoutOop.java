import java.util.Arrays;
import java.util.Scanner;

public class StackWithoutOop {

	int arr[];
	int top;
	
	public StackWithoutOop() {
		
		this.arr=new int[10];
		this.top=-1;
		
	}
	public StackWithoutOop(int size)
	{
		this.arr=new int[size];
		this.top=-1;
	}
	public void push(int data)
	{
		if(top<arr.length-1)
		{
			top=top+1;
			arr[top]=data;
		}
		else
		{
			System.out.println("!!!!!!!! stack is full !!!!!");
			
		}
		
	}
	public int  pop()
	{
		int data;
		if(top==-1)
		{
			System.out.println("!!!Stack is empty!!!");
		}
		else
		{
			data=arr[top];
			top=top-1;
			return data;
		}
		
		return 0;
		
	}
	
	@Override
	public String toString() {
		
		String str="\n";
		for(int i=0;i<top;i++)
		{
			 str= (str+arr[i]+"\t");
		}
		return str;

	}
	public static void main(String[] args)
	{
		//stack : Last In First Out
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the size of stack::");
		StackWithoutOop s1=new StackWithoutOop();
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		s1.push(60);
		s1.push(70);
		s1.push(80);
		s1.push(90);
		System.out.println("Stack after pushing elements into stack::");
		System.out.println(s1);
		s1.push(100);
		s1.push(200);
		s1.push(300);
		s1.pop();
		s1.pop();
		s1.pop();
		System.out.println("Stack after pop elements from stack::");
		System.out.println(s1);
		
		
	}

}

