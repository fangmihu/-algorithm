/*******************************************************
 * Copyright (C) 2018 KEEP.COM - All Rights Reserved
 *
 * @Date: 2018/11/12
 * @Author: fangmingfu <fangmingfu@keep.com>
 * ******************************************************/


public class code11 {

    class Solution {
        public int maxArea(int[] height) {
            if(height == null || height.length < 2) return 0;
            int left = 0;
            int right  = height.length - 1;
            int res = 0;
            while (left < right){
                int area;
                if (height[left] < height[right]){
                    area = (right - left) * height[left];
                    left ++;
                }else{
                    area = (right - left) * height[right];
                    right --;
                }
                res = Math.max(res, area);
            }
            return res;
        }
    }
}
