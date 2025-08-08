import java.util.*;

class RomanToInteger {
    public static int romanToInt(String s) {
        int sum=0;
    
      Map<Character,Integer> map=new HashMap<>();
      map.put('I',1);
      map.put('V',5);
      map.put('X',10);  
      map.put('L',50);
      map.put('C',100); 
      map.put('D',500);
      map.put('M',1000);
      for(int i=0;i<s.length();i++){
        int curr=map.get(s.charAt(i));
        int next=0;
        if(i+1<s.length()){
             next=map.get(s.charAt(i+1));

        }
        if(curr<next)
        {
            sum-=curr;
        }
        else{
            sum+=curr;
        }
      }
        return sum;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(RomanToInteger.romanToInt(s));
    }
}