import java.util.*;
class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        String newstring="";
        String clean=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        
        for(int i=clean.length()-1;i>=0;i--){
            newstring+=clean.charAt(i);
        }
        if(newstring!=null && clean.equals(newstring)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.next();
        System.out.println(ValidPalindrome.isPalindrome(s));

    }
}