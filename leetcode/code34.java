/*******************************************************
 * Copyright (C) 2018 KEEP.COM - All Rights Reserved
 *
 * @Date: 2018/11/14
 * @Author: fangmingfu <fangmingfu@keep.com>
 * ******************************************************/


public class code34 {

    static class Solution {
        public int[] searchRange(int[] nums, int target) {
            int left=-1, right=-1;
            int low=0, high=nums.length-1;
            int mid=0;

            int[] ret = new int[2];

            while (low <= high){
                mid=(low+high)/2;
                if (nums[mid] == target){
                    if (mid == 0 || nums[mid-1] < nums[mid]){
                        left = mid;
                    }
                    if (mid == nums.length - 1 || nums[mid] < nums[mid+1]){
                        right = mid;
                    }
                    if (left == -1){
                        high = mid - 1;
                        if(low > high)
                            low = 0;
                    }else{
                        low = mid + 1;
                        if (high < low)
                            high = nums.length-1;
                    }
                    if (left != -1 && right != -1)
                        break;
                } else if (nums[mid] > target){
                    high = mid-1;
                } else {
                    low = mid+1;
                }

            }

            ret[0]=left;
            ret[1]=right;
            return ret;



        }
    }

    public static void main(String[] args) {
        new Solution().searchRange(new int[]{5,7,7,8,8}, 8);
    }
}
