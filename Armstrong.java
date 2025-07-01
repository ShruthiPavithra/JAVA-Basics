import java.util.*;
public class Armstrong{
 public static void main(String args[]){
  int num,sum=0;
  Scanner sc=new Scanner(System.in);
  num=sc.nextInt();
  String newnum=String.valueOf(num);
  int length=newnum.length();
  for(int i=0;i<length;i++){
   int number=Character.getNumericValue(newnum.charAt(i));
   sum+=Math.pow(number,length);
  }
  if(sum==num){
   System.out.println("Armstrong");
  }
  else{
   System.out.println("not an armstrong number");
  }
  }
 }