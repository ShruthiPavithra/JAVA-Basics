import java.util.*;
public class Loop1{
 public static void main(String args[]){
  int n;
  System.out.println("Enter a number");
  Scanner scanner=new Scanner(System.in);
  n=scanner.nextInt();
  for(int i=1;i<=n;i++){
   if(i%2==1){
    System.out.println(i);
   }
  }
 }
}

