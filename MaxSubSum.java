import java.util.*;
public class MaxSubSum{
 public static int Sum(int[] arr,int w){
  int current=0;
  int max=0;
  for(int i=0;i<w;i++){
   current+=arr[i];
  }
  max=current;
  for(int i=1;i<=arr.length-w;i++){
   current=current-arr[i-1]+arr[i+w-1];
   if(current>max) {
    max=current;
  }
 }
  return max;
 }
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
 int n;
 System.out.println("Enter the size of the array");
 n=sc.nextInt();
 int[] arr=new int[n];
 for(int i=0;i<arr.length;i++){
  arr[i]=sc.nextInt();
 }
 int w=sc.nextInt();
 System.out.println(MaxSubSum.Sum(arr,w));
 }
}