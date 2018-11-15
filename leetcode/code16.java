import java.util.Arrays;

/*******************************************************
 * Copyright (C) 2018 KEEP.COM - All Rights Reserved
 *
 * @Date: 2018/11/12
 * @Author: fangmingfu <fangmingfu@keep.com>
 * ******************************************************/


public class code16 {

    static class Solution {
        public int threeSumClosest(int[] nums, int target) {
            if(nums == null || nums.length < 3) return 0;
            Arrays.sort(nums);
            int res = Integer.MAX_VALUE;
            for (int i = 0; i < nums.length - 2; i ++){
                int start = i + 1;
                int end = nums.length - 1;
                while (start < end){
                    int sum = nums[i] + nums[start] + nums[end];
                    if ( Math.abs(target - sum) < Math.abs(res)){
                        res = target - sum;
                    }
                    if(sum > target){
                        end --;
                    }else{
                        start ++;
                    }
                }
            }
            return target - res;

        }
    }

    public static void main(String[] args) {
        new Solution().threeSumClosest(new int[]{1,1,-1,-1,3}, -1);
    }
}
