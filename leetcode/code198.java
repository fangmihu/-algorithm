/*******************************************************
 * Copyright (C) 2018 KEEP.COM - All Rights Reserved
 *
 * @Date: 2018/11/14
 * @Author: fangmingfu <fangmingfu@keep.com>
 * ******************************************************/


public class code198 {

    class Solution {
        public int rob(int[] nums) {
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
