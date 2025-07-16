import java.util.*;
public class Square{
 public static void main(String args[]){
  int num,newsquare;
  System.out.println("Enter a number");
  Scanner scanner=new Scanner(System.in);
  num=scanner.nextInt();   
  int square=(int)Math.floor(Math.sqrt(num))+1;
  int result=square*square;
  System.out.println(result);
 }
}
  