import java.util.HashMap;
import java.util.Map;

/*******************************************************
 * Copyright (C) 2018 KEEP.COM - All Rights Reserved
 *
 * @Date: 2018/11/8
 * @Author: fangmingfu <fangmingfu@keep.com>
 * ******************************************************/

public class code3 {
    static class Solution {
        public int lengthOfLongestSubstring(String s) {
            Map<Character,Integer> map = new HashMap<>();
            int res = 0;
            int start = -1;
            for(int i = 0; i < s.length(); i++){
                if(map.containsKey(s.charAt(i))){
                    start = map.get(s.charAt(i)) > start ? map.get(s.charAt(i)) : start;
                }
                res = Math.max(res, i - start);
                map.put(s.charAt(i), i);
            }
            return res;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring("abba"));
    }
}
