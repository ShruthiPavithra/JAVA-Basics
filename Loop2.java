import java.util.*;
public class Loop2{
 public static void main(String args[]){
  int num,fact=1;
  System.out.println("Enter a number");
  Scanner scanner=new Scanner(System.in);
  num=scanner.nextInt();
  for(int i=1;i<=num;i++){
   fact=fact*i;
  }
 System.out.println("Facorial " + fact);
 }
} 
   