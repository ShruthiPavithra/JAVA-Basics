import java.util.*;
public class Reverse2{
 public static void main(String args[]){
  int num,temp,rev=0;
  Scanner sc=new Scanner(System.in);
  num=sc.nextInt();
  while(num!=0){
   temp=num%10;
   rev=rev*10+temp;
   num=num/10;
  }
 System.out.println(rev);
 }
}
  