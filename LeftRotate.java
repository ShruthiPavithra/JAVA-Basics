import java.util.*;
public class LeftRotate{
 public static void left(int[] arr){

 int len=arr.length-1;
 int temp=arr[0];
  for(int i=1;i<arr.length;i++){
          arr[i-1]=arr[i];
      
  }
          arr[arr.length-1]=temp;
System.out.println("After Rotation\n");
for(int i=0;i<arr.length;i++){
 System.out.println(arr[i]);
}
}
public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int[] arr=new int[n];
 for(int i=0;i<n;i++){
  arr[i]=sc.nextInt();
 }
 LeftRotate.left(arr);
}
} 
  