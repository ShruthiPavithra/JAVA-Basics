import java.util.*;
public class Conditional{
 public static void main(String args[]){
   int a,b,max; 
   System.out.println("Enter two numbers");
   Scanner scanner=new Scanner(System.in);
   a=scanner.nextInt();
   b=scanner.nextInt();
   max=(a>b)? a : b;
   System.out.println(max);
  }
}
  