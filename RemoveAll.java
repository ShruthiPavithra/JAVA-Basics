import java.util.*;
public class RemoveAll{
 public static void main(String args[]){
  String input;
  Scanner sc=new Scanner(System.in);
  input=sc.next();
  String s1="";
  String alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
  s1=input.replaceAll("[^alpha]","");
  System.out.println(s1);
 }
}