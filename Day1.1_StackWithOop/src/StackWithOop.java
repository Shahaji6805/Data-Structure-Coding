
public class StackWithOop {
	
	private int stack[];
	private int top;
	
	public StackWithOop() {
		System.out.println("default constructor");
		this.stack=new int[5];
		this.top=-1;
	}

	public StackWithOop(int size) {
		System.out.println("para constructor");
		this.stack=new int[size];
		this.top=-1;
	}
	public void push(int data)
	{
		if(top==stack.length-1)
		{
			System.out.println("!!!stack is overflow!!!!!");
		}
		else
		{
			top=top+1;
			stack[top]=data;
			
		}
	}
	public int pop()
	{
		int data=0;
		if(top==-1)
		{
			System.out.println("!!!stack is under flow!!!");
		}
		else
		{
			data=stack[top];
			top=top-1;
		}
		return data;
	}
	
	public String toString()
	{
		String str="\n";
		for(int i=0;i<top;i++)
		{
			str=str+stack[i]+"\t";
		}
		return str;
	}

}
