import java.util.*;
public class SecondLargest{
 public static void main(String args[]){
  int n;
  Scanner sc=new Scanner(System.in);
  n=sc.nextInt();
  int[] arr=new int[n];
  for(int i=0;i<arr.lngth;i++){
   arr[i]=sc.nextInt();
  }
  int max=arr[0];
  for(int i=0;i<arr.length;i++){
   if(arr[i]>max){
    max=arr[i];
   }
  }
  int secondmax=arr[0];
  for(int i=0;i<arr.length;i++){
   if(arr[i]>max && arr[i]!=max){
    secondmax=arr[i];
   }
  }
 System.out.println(seconmax);
 }
}