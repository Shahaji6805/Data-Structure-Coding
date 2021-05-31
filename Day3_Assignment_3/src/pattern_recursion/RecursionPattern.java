package pattern_recursion;

public class RecursionPattern {


	public static void main(String[] args)
	{
		
		recursivePattern(1);
		
	}

	static void recursivePattern(int x)
	{
		for(int i=1;i<=x;i++)
		System.out.print("*"+" ");
		System.out.println();
		if(x>=3)
		{
			 return;
			 
		}

		recursivePattern(x+1);
		for(int i=1;i<=x;i++)
		System.out.print("*"+" ");
		System.out.println();
		
		
	
	}




}
