/*******************************************************
 * Copyright (C) 2018 KEEP.COM - All Rights Reserved
 *
 * @Date: 2018/11/11
 * @Author: fangmingfu <fangmingfu@keep.com>
 * ******************************************************/


public class code5 {
    static class Solution {
        public String longestPalindrome(String s) {
            if(s.length() == 0){
                return "";
            }
            boolean[][] dp = new boolean[s.length()][s.length()];
            String res = s.substring(0,1);
            for(int i = s.length() - 1; i >= 0; i--){
                for(int j = s.length() - 1; j > i; j--){
                    if(s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i+1][j-1])){
                        dp[i][j] = true;
                        if(j - i + 1 > res.length()){
                            res = s.substring(i, j+1);
                        }
                    }
                }
            }

            return res;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "aaaa";
//        System.out.println(s.length());
        System.out.println(solution.longestPalindrome(s));
//        System.out.println(s.substring(0,2));
    }
}
