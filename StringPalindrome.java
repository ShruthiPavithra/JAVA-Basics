import java.util.*;
public class StringPalindrome{
 public static void main(String args[]){
  String input,s1="",s2="";
  Scanner sc=new Scanner(System.in);
  input=sc.next();
  for(int i=input.length()-1;i>=0;i--)
  {
   s1+=input.charAt(i);
  }
  if(input.equals(s1))
  {
   System.out.println("It is palindrome");
 }
 else{
  System.out.println("Not a palindrome");
 }
}
}