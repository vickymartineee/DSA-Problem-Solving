package Problems.Easy;

import java.util.Arrays;

public class ReverseArray {
//    normal way
    public static void main(String [] args){
        int [] a = {1,3,0,5,6,1,4,6};
        for(int i=0;i<(a.length/2); i++){
            int temp = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
