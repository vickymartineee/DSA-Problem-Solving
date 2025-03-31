package Problems.Easy;

import java.util.Scanner;

public class GirlsToImpress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int [] a = new int[N];
            int max=0;
            for(int j =0;j<N;j++){
                a[j] = sc.nextInt();
                if(j<K){
                    max+= a[j];
                }
            }

            int temp =max;
            for(int m=K;m<N;m++){
                temp = temp+a[m]-a[m-K];
                max= Math.max(max,temp );
            }
            System.out.println(max);

        }
    }
}
