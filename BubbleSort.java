import java.util.*;
public class BubbleSort{
 public static void main(String args[]){
  int n,temp;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the size of the array");
  n=sc.nextInt();
  int[] arr=new int[n];
  System.out.println("Enter the array elements");
  for(int i=0;i<arr.length;i++)
  {
   arr[i]=sc.nextInt();
 }
  for(int i=1;i<arr.length;i++)
  {
   for(int j=0;j<arr.length-i;j++)
   {
    if(arr[j]>arr[j+1])
    {
     temp=arr[j];
     arr[j]=arr[j+1];
     arr[j+1]=temp;
    }
   }
  }
 System.out.println("Sorted array: ");
 for(int i=0;i<arr.length;i++)
 {
  System.out.print(" " + arr[i]);
  }
}
}