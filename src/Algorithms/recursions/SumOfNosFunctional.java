package Algorithms.recursions;

import java.util.Scanner;

public class SumOfNosFunctional {

    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        System.out.println(sumofNos(s.nextInt()));
    }
    static int sumofNos(int n){
        if(n==0){
            return 0;
        }
        return n + sumofNos(n-1);
    }
}
