package pattern_recursion;

public class numberPatternRecursion {


		static int n=0;

		  void fun(int x){

			for(int i=0;i<x+n;i++){

				if(i%2==0){
			
					System.out.print("1");
				}else{

					System.out.print("2");
				}
			}
			System.out.println();
			n++;
			
			if(x<3){

				fun(x+1);
			}
			
			n--;
			if(x<3){

				
				
				for(int i=0;i<x+n;i++){

					if(i%2==0){
			
						System.out.print("1");
					}else{

						System.out.print("2");
					}
				}
				System.out.println();
			}
		}

}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * static void numberPattern(int x) { if(x<3) {
	 * 
	 * System.out.print("1");
	 * 
	 * } System.out.println(); if(x==2) { for(int i=1;i<x;i++) {
	 * System.out.print("21"); } }
	 * 
	 * if(x>=3) { return; } numberPattern(x+1); if(x<=3) { System.out.print("1"); }
	 * for(int i=1;i<=x;i++) { System.out.print("21"); }
	 * 
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * public static void main(String[] args) {
	 * 
	 * numberPattern(1);
	 * 
	 * 
	 * }
	 */

	
		

	
