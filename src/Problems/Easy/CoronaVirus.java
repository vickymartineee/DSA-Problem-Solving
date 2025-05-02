package Problems.Easy;

import java.util.Scanner;

public class CoronaVirus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            int N = sc.nextInt();

            int [] X = new int[N];
            for(int j=0;j<N;j++){
                X[j] = sc.nextInt();
            }

            int n=N-1;
            int temp =0;
            int max= 1, min=1;
            boolean brk =false;
            while (n!=0){
                int sub = X[n]-X[n-1];
                if(sub<=2){
                    temp += 1;
                    if(n-1==0){
                        if(temp>max){
                            max= temp+1;
                        }
                        if(temp<min || !brk){
                            min= temp+1;
                            if(max==temp){
                                max= temp+1;
                            }
                        }
                    }
                } else{
                    max= temp+1;
                    min= temp+1;
                    temp = 0;
                    brk= !brk;
                }
                n--;
            }
            if(min == max && (min!=temp) && temp ==0){
                min=temp+1;
                max= temp+1;
            }
            System.out.println((min) + " " + (max));
        }

    }
}
