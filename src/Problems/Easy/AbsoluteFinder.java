package Problems.Easy;

import java.util.Scanner;

/*
*
* 1
6 78
5 10 3 2 50 80
1
*
* */

public class AbsoluteFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int p = 0; p < T; p++) {
            int N = sc.nextInt();
            int B = sc.nextInt();
            int[] A = new int[N];
            for(int k=0;k<N;k++){
                A[k] = sc.nextInt();
            }

            int i=0;
            int j=1;
            while(i<A.length && j<A.length){
                if(Math.abs(A[i]-A[j]) == B){
                    System.out.println(1);
                    break;
                }
                j++;
                if(j==A.length){
                    i++;
                    j=i+1;

                }
                if(i+1==A.length){
                    System.out.println(0);
                    break;
                }
            }
        }
    }
}
