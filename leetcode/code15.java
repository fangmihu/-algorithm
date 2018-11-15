import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*******************************************************
 * Copyright (C) 2018 KEEP.COM - All Rights Reserved
 *
 * @Date: 2018/11/12
 * @Author: fangmingfu <fangmingfu@keep.com>
 * ******************************************************/


public class code15 {

    static class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            if(nums.length < 3) return Collections.EMPTY_LIST;
            Arrays.sort(nums);
            List<List<Integer>> res = new ArrayList<>();
            int last = nums[0];
            for(int i = 0; i < nums.length - 2 ; i++){
                if(i != 0 && last == nums[i]) continue;
                if(nums[i] > 0) break;
                int left = i+1;
                int right = nums.length -1;
                while (left < right) {
                    if (nums[i] + nums[left] + nums[right] == 0) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[left ++]);
                        list.add(nums[right --]);
                        res.add(list);
                        while (left < right && nums[left] == nums[left -1]) {left++;} // avoid duplicates
                        while (left < right && nums[right] == nums[right + 1]) {right--;} // avoid duplicates
                    }
                    if (nums[i] + nums[left] + nums[right] > 0) {
                        right --;
                    }
                    if (nums[i] + nums[left] + nums[right] < 0) {
                        left ++;
                    }
                }
                last = nums[i];
            }
            return res;
        }
    }

    public static void main(String[] args) {
        new Solution().threeSum(new int[]{-1,0,1,2,-1,-4});
    }

}
