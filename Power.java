import java.util.*;
public class Power{
 public static void main(String args[]){
  int num1,num2;
  Scanner sc=new Scanner(System.in);
  num1=sc.nextInt();
  num2=sc.nextInt();
  int power=(int)Math.pow(num1,num2);
  System.out.println(power);
 }
}
  