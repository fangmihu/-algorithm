/*******************************************************
 * Copyright (C) 2018 KEEP.COM - All Rights Reserved
 *
 * @Date: 2018/11/11
 * @Author: fangmingfu <fangmingfu@keep.com>
 * ******************************************************/


public class code8 {
    static class Solution {
        public int myAtoi(String str) {
            if(str == null ||str.length() == 0){
                return 0;
            }
            int start = 0;
            long res = 0;
            while (start < str.length() && str.charAt(start) == ' '){
                start ++;
            }
            boolean flag = true;
            if(start < str.length() && (str.charAt(start) == '-' || str.charAt(start) == '+')){
                if(str.charAt(start) == '-'){
                    flag = false;
                }
                start ++;
            }
            if(!(start < str.length() && str.charAt(start) >= '0' && str.charAt(start) <= '9')){
                return 0;
            }
            while (start < str.length() && str.charAt(start) >= '0' && str.charAt(start) <= '9') {
                res = res * 10 + (str.charAt(start) - '0');
                start ++;
                if(  res > Integer.MAX_VALUE){
                    break;
                }
            }
            res = flag ? res : -res;
            if( flag && res > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(res < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            return (int)res;

        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.myAtoi("   -123"));
    }
}
