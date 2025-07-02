import java.util.*;
public class EvenOdd{
 public static void main(String args[]){
  int num;
  Scanner scanner=new Scanner(System.in);
  num=scanner.nextInt();
  if(num%2==0){
   System.out.println("Even Number");
  }
  else{
   System.out.println("Odd number");
  }
 }
}