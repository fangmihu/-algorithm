import java.util.logging.Level;

/*******************************************************
 * Copyright (C) 2018 KEEP.COM - All Rights Reserved
 *
 * @Date: 2018/11/14
 * @Author: fangmingfu <fangmingfu@keep.com>
 * ******************************************************/


public class code153 {

    class Solution {
        public int findMin(int[] nums) {
            if(nums.length == 0) return 0;
            if(nums[0] < nums[nums.length - 1]) return nums[0];
            int start = 0;
            int end = nums.length - 1;
            while (start < end){
                int mid = start + (end - start)/2;
                if(nums[mid] > nums[end]){
                    start = mid;
                }else{
                    end = mid;
                }
            }
            return nums[end];
        }
    }
}
