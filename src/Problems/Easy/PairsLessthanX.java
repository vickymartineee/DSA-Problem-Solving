package Problems.Easy;

import java.util.Scanner;
import java.util.ArrayList;

public class PairsLessthanX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(countPairsLessThanX(arr, x));
    }

    public static long countPairsLessThanX(int[] arr, int x) {
        long res = 0;
        int i = 0;
        int j = arr.length-1;
        while (i<j) {
            if (arr[j] + arr[i] < x) {
                res++;
                j--;
                if(((j)-i)==0){
                    j= arr.length-1;
                    i++;
                }
                continue;
            }
            if (arr[j] + arr[i] >= x) {
                j--;
            }

        }
        return res;
    }
}
