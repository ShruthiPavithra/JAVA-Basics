import java.util.*;
public class Ifelse{
 public static void main(String args[]){
   int num;
   System.out.println("Enter a number");
   Scanner scanner=new Scanner(System.in);
   num=scanner.nextInt();
   if (num>0){
     System.out.println(num + "is positive");
   }
   else if(num==0){
         System.out.println(num + "is neutral");
        }
   else{
         System.out.println(num + "is negative");
    }
  }
}