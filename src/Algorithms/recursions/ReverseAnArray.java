package Algorithms.recursions;

import java.util.Arrays;

public class ReverseAnArray {

    static void reverseArr(int [] arr, int x1){
        if(x1>=(arr.length/2)){
            return;
        }
        int temp = arr[x1];
        arr[x1] = arr[arr.length-x1-1];
        arr[arr.length-x1-1] = temp;
        reverseArr(arr,x1+1);
    }
    public static void main(String [] args){
        int [] a = {1,3,4,5,6};
        reverseArr(a, 0);
        System.out.println(Arrays.toString(a));
    }
}
