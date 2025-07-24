import java.util.*;
public class RemoveVowels{
 public static void main(String args[]){
  String input,s1="";
  Scanner sc=new Scanner(System.in);
  input=sc.next();
  s1=input.replaceAll("[aeiou]","");
  System.out.println(s1);
 }
}
