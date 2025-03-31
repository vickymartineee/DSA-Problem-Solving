package Algorithms.DP;

public class Fibonacci {
    static int fibonacci(int n, int[] memo) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        return fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
//        f(3)+f(2)
//        f(2)+f(1)
//        f(1)+1 => 1+0

    }

    static int tabulationFibonacci(int n, int[] table) {
        table[0] = 0;
        table[1] = 1;
        for (int i = 2; i <= n; i++) {
            table[i] = table[i - 1] + table[i - 2];
            System.out.println(table[i]);
        }
        return table[n];
    }

    public static void main(String[] args) {
//        System.out.println(fibonacci(3, new int[3 + 1]));
        System.out.println(tabulationFibonacci(6, new int[7]));

    }
}
