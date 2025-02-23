package Problems.Easy;

import java.util.HashMap;

public class TwoSum {
    public static void main(String [] args) {
        int[] nums = {2, 7,11, 15};
        int target = 9;
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer temp  = target - nums[i];
            if(numMap.get(temp)!= null){
                int [] n = {numMap.get(temp),i};
                System.out.println(n[0]+" "+ n[1]);
            }
            numMap.put(nums[i],i);
        }
    }
}
