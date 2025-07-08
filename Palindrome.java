import java.util.*;
public class Palindrome{
 public static void main(String args[]){
  int num,rev=0,rem;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number");
  num=sc.nex
tInt();
  if (reverse(num,rev)==num){
   System.out.println("Palindrome");
  }
  else{
   System.out.println("not a palindrome");
  }
 }
 static int reverse(int num,int rev){
  if(num==0){
   return rev;
  }
  int rem=num%10;
  rev=rev*10+rem;
  return reverse(num/10,rev);
  }
 }


