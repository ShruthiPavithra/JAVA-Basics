import java.util.*;
public class Alphabet{
 public static void main(String args[]){
  String input;
  Scanner sc=new Scanner(System.in);
  input=sc.next();
  char ch=input.charAt(0);
  if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') )
  {
   System.out.println("It is an alphabet");
  }
  else{
   System.out.println("It is not an alphabet");
  }
 }
}