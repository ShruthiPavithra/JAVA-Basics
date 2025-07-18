import java.util.*;
public class Vowel{
 public static void main(String args[]){
  String input;
  char ch;
  Scanner sc=new Scanner(System.in);
  input=sc.next();
  ch=input.charAt(0);
  if(ch=='A'||ch=='a'||ch=='E'||ch=='e'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u')
  {
   System.out.println("It is a vowel");
  }
  else{
   System.out.println("It is a consonant");
  }
 }
}