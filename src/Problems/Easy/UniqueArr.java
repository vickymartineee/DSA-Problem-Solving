package Problems.Easy;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueArr
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            int N = sc.nextInt();
            int [] A = new int [N];
            int [] B = new int [N];
            for(int k=0;k<N;k++){
                A[k] = sc.nextInt();
            }
            for(int l=0;l<N;l++){
                B[l] = sc.nextInt();
            }

            Set<Integer> uniqueSet = new HashSet<>();
            for(int m=0;m<N;m++){
                uniqueSet.add(A[m]);
                uniqueSet.add(B[m]);
                System.out.println(uniqueSet + " A "+ A[m]+ " B "+B[m]);
            }


            System.out.println((2*N)-uniqueSet.size());
            uniqueSet.clear();
        }

    }
}
