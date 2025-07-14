import java.util.*;
public class PrimeRange{
 public static void main(String args[]){
  int a,b,count;
  Scanner sc=new Scanner(System.in);
  a=sc.nextInt();
  b=sc.nextInt();
  for(int i=a;i<=b;i++)
  {
   if(Check(i))
   {
    System.out.println(i);
   }
 }
 }

 public static boolean Check(int num)
 {
  if(num<=1){
   return false;
  }
  for(int i=2;i<=num/2;i++)
  {
   if(num%i==0)
    return false;
  }
  return true;
  }

}



   	
  