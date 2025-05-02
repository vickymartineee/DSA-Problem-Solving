package Algorithms.DP;

public class Factorial {
    static long factor(int n, long [] mem) {
        if (n == 1) {
            return 1;
        }
        if(mem[n]!=0){
            return mem[n];
        }
        return n * factor(n - 1,mem);
    }

    public static void main(String[] args) {
        int n = 20;
        System.out.println(factor(n, new long[n+1]));
    }
}
