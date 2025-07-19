import java.util.*;
public class SecondSmallest{
 public static void main(String args[]){
  int n;
  Scanner sc=new Scanner(System.in);
  n=sc.nextInt();
  int[] arr=new int[n];
  for(int i=0;i<arr.length;i++){
   arr[i]=sc.nextInt();
  }
  int min=arr[0];
  for(int i=0;i<arr.length;i++){
   if(arr[i]<min){
    min=arr[i];
   }
  }
  int secondmin=Integer.MAX_VALUE;
  for(int i=0;i<arr.length;i++){
   if(arr[i]>min && arr[i]<secondmin){
    secondmin=arr[i];
   }
  }
 System.out.println(secondmin);
 }
}