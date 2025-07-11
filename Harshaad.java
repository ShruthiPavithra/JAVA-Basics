import java.util.*;
public class Harshaad{
 public static void main(String args[]){
  int num,temp,sum=0,temp1;
  Scanner sc=new Scanner(System.in);
  num=sc.nextInt();
  temp1=num;
  while(num!=0){
   temp=num%10;
   sum=sum+temp;
   num=num/10;  }
 if(temp1%sum==0){
  System.out.println("Harshaad number");
 }
 else{
  System.out.println("Not a harshaad number");
 }
}
}