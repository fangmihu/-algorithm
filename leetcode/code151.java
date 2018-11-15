/*******************************************************
 * Copyright (C) 2018 KEEP.COM - All Rights Reserved
 *
 * @Date: 2018/11/14
 * @Author: fangmingfu <fangmingfu@keep.com>
 * ******************************************************/


public class code151 {

    static public class Solution {
        public String reverseWords(String s) {
            if(s == null || s == "") return s;
            return reverse(s.toCharArray()).reverse().toString();
        }

        public StringBuilder reverse(char[] chars){
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (chars[i] == ' '){
                i++;
            }
            for(; i < chars.length; i++){
                if(chars[i] != ' '){
                    int temp = i;
                    while (temp < chars.length && chars[temp] != ' '){
                        temp ++;
                    }
                    for(int j = temp - 1; j >= i ; j-- ){
                        sb.append(chars[j]);
                    }
                    i = temp - 1;
                }else{
                    sb.append(' ');
                }
            }
            return sb;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().reverseWords(""));
    }
}
