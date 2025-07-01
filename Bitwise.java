import java.util.*;
public class Bitwise{
  public static void main(String args[]){
     int a=5,b=12;
     int c=a & b;
     System.out.println("AND: "+ c);
     c=a | b;
     System.out.println("OR: "+ c);
     c=a ^ b;
     System.out.println("XOR: "+ c);
     c= ~a;
     System.out.println("NOT: "+ c);
     System.out.println( a << 1);
     }
}
     