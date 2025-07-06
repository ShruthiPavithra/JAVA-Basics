import java.util.*;
public class Input{
 public static void main(String args[]){
   Scanner scanner=new Scanner(System.in);
   System.out.println("What's your name? ");
   String name=scanner.nextLine();
   System.out.println(name);
   System.out.println("What's your age? ");
   int age=scanner.nextInt();
   System.out.println(age);
  }
}