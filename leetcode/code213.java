import java.util.Arrays;

/*******************************************************
 * Copyright (C) 2018 KEEP.COM - All Rights Reserved
 *
 * @Date: 2018/11/14
 * @Author: fangmingfu <fangmingfu@keep.com>
 * ******************************************************/


public class code213 {

    class Solution {
        public int rob(int[] nums) {
            if(nums.length == 0) return 0;
            if(nums.length == 1) return nums[0];
            return Math.max(rob1(Arrays.copyOfRange(nums, 0, nums.length - 1)),
                    rob1(Arrays.copyOfRange(nums, 1, nums.length)));
        }

        public int rob1(int[] nums) {
            int preYes = 0;
            int preNo = 0;
            for(int i = 0; i < nums.length; i ++){
                int temp = preNo;
                preNo = Math.max(preNo, preYes);
                preYes = nums[i] + temp;
            }
            return Math.max(preNo,preYes);
        }
    }
}
