import java.util.*;
public class Sort{
public static void SelectionSort(int[] arr)
{
 int min;
 int temp=0;
 
 for(int i=0;i<arr.length;i++)
 {
  min=arr[i];
  int minIndex=i;
  for(int j=i;j<arr.length;j++)
  {
   if(arr[j]<min)
   {
    min=arr[j];
    minIndex=j;
   }
  }
 temp=arr[i];
 arr[i]=arr[minIndex];
 arr[minIndex]=temp;
 }
  }
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int n;
 System.out.println("Enter the size of the array");
 n=sc.nextInt();
 int[] arr=new int[n];
 for(int i=0;i<arr.length;i++){
  arr[i]=sc.nextInt();
 }
 Sort.SelectionSort(arr);
 for(int i=0;i<arr.length;i++)
 System.out.println(arr[i]);
 }
}