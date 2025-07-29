import java.util.*;
public class BinarySearch{
 public static void main(String args[]){
  int n;
  boolean flag=false;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the size of the array");
  n=sc.nextInt();
  int[] arr=new int[n];
  System.out.println("Enter the array elements");
  for(int i=0;i<arr.length;i++){
   arr[i]=sc.nextInt();
  }
  int target;
  System.out.println("Enter the target");
  target=sc.nextInt();
  int low=0;
  int high=n-1;
  
  int index=0;
  while(low<=high){
   int mid=(low+high)/2;
   if(arr[mid]==target){
    
    System.out.println("Element found " + mid);
    flag=true;
    return;
   
   }
   else{
      if(arr[mid]<target){
       low=mid+1;
       }
      else{
       high=mid-1;
      }
    }
  }
  
   System.out.println("Element not found");
 }
}