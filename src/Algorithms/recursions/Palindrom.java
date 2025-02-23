package Algorithms.recursions;

public class Palindrom {
    public static void main(String [] args){
        System.out.println(checkPali("malayalam",0)? "Palindrome": "Not a Palindrome");
        System.out.println(checkPali("hello",0)? "Palindrome": "Not a Palindrome");
    }
    static boolean checkPali(String s,int x1){
        if(x1>(s.length()/2)){
            return true;
        }
        if(s.charAt(x1)!= s.charAt(s.length()-x1-1)){
            return false;
        }
       return checkPali(s,x1+1);
    }
}
