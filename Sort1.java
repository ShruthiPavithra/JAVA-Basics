import java.util.*;
public class Sort1{
 public static void InsertionSort(int[] arr)
 {
  int temp=0;
  for(int i=1;i<arr.length;i++)
  {
   for(int j=i;j>0;j--)
   {
    if(arr[j]<arr[j-1])
    {
     temp=arr[j-1];
     arr[j-1]=arr[j];
     arr[j]=temp;
   }
   else{
     break;
   }
  }
 }
}
public static void main(String args[])
{
 int n;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the size of the array");
 n=sc.nextInt();
 System.out.println("Enter the array elements");
 
 int[] arr=new int[n];
 for(int i=0;i<arr.length;i++)
 {
  arr[i]=sc.nextInt();
 }
Sort1.InsertionSort(arr);
System.out.println("Sorted Array");
for(int i=0;i<arr.length;i++)
{
 System.out.print(arr[i]);
}
}
}