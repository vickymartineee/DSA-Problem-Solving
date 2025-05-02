package Problems.Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DuplicatesTwoPtr {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int[] A = new int[N];

            for (int k = 0; k < N; k++) {
                A[k] = sc.nextInt();
            }

            int p = 0;
            int k = 1;
            List<Integer> result = new ArrayList<>();
            if(A.length == 1){
               result.add(A[0]);
            }
            while (p < A.length && k<A.length) {
                if (A[p] == A[k]) {
                    k++;
                    if(k == A.length){
                        result.add(A[p]);
                    }
                    continue;
                } else {
                    result.add(A[p]);
                    p = k;
                }

                k++;
                if(k == A.length){
                    result.add(A[p]);
                }
            }
            System.out.println(result.size());
            result.forEach(x-> System.out.print(x + " "));
            System.out.println();
        }


    }
}
