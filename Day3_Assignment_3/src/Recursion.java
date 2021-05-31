
public class Recursion {
	
	
	void fun(int x)
	{
		System.out.print(x+" ");
		if(x>=10)
		{
			 return;
			 
		}
		fun(x+1);
		System.out.print(x+" ");
		
		
	}
	
}
