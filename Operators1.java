import java.util.*;
public class Operators1{
 public static void main(String args[]){
  int a=3,b=4,c;
  c=a + b + a++ + b++ + ++a + ++b;
  System.out.println(c);
 }
}