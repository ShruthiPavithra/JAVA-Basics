import java.util.*;
public class Fibonacci{
 public static void main(String args[]){
  int num,sum=0;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number");
  num=sc.nextInt(); 
  int a=0,b=1;
  System.out.println(a);
  System.out.println(b);
  for(int i=2;i<num;i++){
   sum=a+b;
  
   System.out.println(sum);
   a=b;
   b=sum;
   

  }
  
 }
}