
  package concatearray;
  
  import java.util.Scanner;
  
  public class ConcateArraywithSorted {
  
  public static void main(String[] args) {
  
  Scanner sc=new Scanner(System.in);
  
  int [] arr1= {2,22,34}; int [] arr2= {-2,6,30};
  
  System.out.println("Array 1:\n"); for(int i=0;i<arr1.length;i++) {
  
  System.out.print(arr1[i]+"\t"); } System.out.println();
  
  System.out.println("Array 2:\n"); for(int i=0;i<arr2.length;i++) {
  
  System.out.print(arr2[i]+"\t"); } System.out.println();
  
  int arr1_size=arr1.length; System.out.println("size of array 1:"+arr1_size);
  int arr2_size=arr2.length; System.out.println("size of array 2:"+arr2_size);
  
  
  int size=(arr1.length)+(arr2.length);
  
  
  int []brr=new int[size];
  
  int count=0; for(int i=0;i<=arr1.length-1;i++) { brr[i]=arr1[i];
  count=count+1;
  
  }
  
  for(int i=0;i<=arr2.length-1;i++) {
  
  brr[count]=arr2[i]; count=count+1; }
  System.out.println("Unsorted Array::\n"); for(int i=0;i<brr.length;i++) {
  
  System.out.print(brr[i]+"\t"); }
  
  
  for (int i = 0; i < brr.length-1; i++) { for (int j = 0; j < brr.length-1;
  j++) { if(brr[j]>brr[j+1]) { int temp=brr[j]; brr[j]=brr[j+1]; brr[j+1]=temp;
  
  }
  
  }
  
  } System.out.println("\nSorted Array:: \n"); for(int i=0;i<brr.length;i++) {
  
  System.out.print(brr[i]+"\t"); }
  
  }
  
  }
 



