import java.util.*;
public class Union{
 public static void union(int[] arr1,int[] arr2){
 Set <Integer> set=new HashSet<>();
 for(int num:arr1) set.add(num);
 for(int num:arr2) set.add(num);
 System.out.println(set);
 }
public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
  int[] arr={1,2,3};
 int[] arr1={2,4,5};
 Union.union(arr,arr1);
}
}