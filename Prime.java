import java.util.*;
public class Prime{
 public static void main(String args[]){
  int num;
  System.out.println("Enter a number");
  Scanner scanner=new Scanner(System.in);
  num=scanner.nextInt();
  int count=0;
  if(num<=1){
   count++;
  }
  for(int i=2;i<=num/2;i++){
   if(num%i==0){
    count++;
   }
 }
if(count==0){
  System.out.println(num + " is a prime number");
 } else {
  System.out.println(num + " is not a prime number");
  }
  scanner.close();
}
}
  