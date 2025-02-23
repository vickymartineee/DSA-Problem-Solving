package Problems.Easy;

import java.util.Arrays;
//2 pointer technique
public class RemoveElements {
    public static void main(String [] args){
        int [] nums = {1,1,2,4,4,5,6,7,2};
        int x= 4;
        int ptr = 0;
        for(int i=0;i< nums.length; i++){
            if(nums[i]!= x){
                nums[ptr] = nums[i];
                ptr++;
            }
        }
        System.out.println(ptr);
        String s ="jj";
        for(int i: nums){
            System.out.println(i);
        }
    }
}
