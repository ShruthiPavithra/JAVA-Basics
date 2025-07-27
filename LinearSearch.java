import java.util.*;
public class LinearSearch{
 public static void main(String args[]){
  int n;
  boolean flag=false;
  System.out.println("Enter the size of the array");
 
  Scanner sc=new Scanner(System.in);
  n=sc.nextInt();
  int i;
  int[] arr=new int[n];
  for(i=0;i<arr.length;i++){
   arr[i]=sc.nextInt();
  }
  System.out.println("Enter the target value");
  int target=sc.nextInt();
  
  for(i=0;i<arr.length;i++){
   if(arr[i]==target){
   System.out.println("Element found at " + i);
   flag=true;
   }
  }
  if(flag==false)
   System.out.println("Element not found");
 }
}