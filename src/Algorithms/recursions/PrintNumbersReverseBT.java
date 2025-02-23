package Algorithms.recursions;

import java.util.Scanner;

public class PrintNumbersReverseBT {

    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();
        reversePrint(c,0);
    }
    static void reversePrint(int n,int i){
        if(i>=n){
            return;
        }
        i=i+1;
        reversePrint(n,i);
        System.out.println(i);
    }

}
