import java.util.*;
public class NoOfVowels{
 public static void main(String args[]){
  String input;
  Scanner sc=new Scanner(System.in);
  input=sc.next();
  int count=0;
  for(int i=0;i<input.length();i++)
  {
   char v=input.charAt(i);
   char upper=Character.toUpperCase(v);
   if(upper=='A'||upper=='E'||upper=='I'||upper=='O'||upper=='U')
   {
    count++;
   }
 }
System.out.println(count);
 }
}
