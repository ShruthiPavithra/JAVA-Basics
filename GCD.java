import java.util.*;
public class GCD{
 public static void main(String args[]){
  int num1,hcf=0,num2;
  Scanner sc=new Scanner(System.in);
  num1=sc.nextInt();
  num2=sc.nextInt();
  for(int i=1;i<=num1||i<=num2;i++){
   if(num1%i==0 && num2%i==0){
    hcf=i;
   }
  }
  System.out.println(hcf);
 }
}