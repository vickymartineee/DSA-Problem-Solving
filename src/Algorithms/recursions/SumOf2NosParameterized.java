package Algorithms.recursions;

import java.util.Scanner;

public class SumOf2NosParameterized {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        calculateSum(x,0);
    }

    static void calculateSum(int n,int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        sum += n;
        calculateSum(n-1,sum);
    }
}
