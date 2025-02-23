package Algorithms.recursions;

import java.util.Scanner;

public class PrintNameNtimes {

    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();
        printName(c);
    }
    static public void printName(int c){
        if(c==0){
            return;
        }
        c= c-1;
        printName(c);
        System.out.println("My name is Vignesh !!");
    }
}
