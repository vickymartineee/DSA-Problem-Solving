package Algorithms.recursions;

public class Fibonacci {
    static int findFibonacciNum(int n){
        if(n<=1){
            return n;
        }
        return findFibonacciNum(n-1)+ findFibonacciNum(n-2);
    }
    public  static void main(String [] args){
        System.out.println(findFibonacciNum(4));
    }
}
