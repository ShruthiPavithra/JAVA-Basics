import java.util.*;
public class StringReverse{
 public static void main(String args[]){
  String input;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the String");
  input=sc.next();
  String s1="";
  for(int i=input.length()-1;i>=0;i--){
   s1+=input.charAt(i);
  }
 System.out.println("Reversed String "+ s1);
 }
}