
/*******************************************************
 * Copyright (C) 2018 KEEP.COM - All Rights Reserved
 *
 * @Date: 2018/11/11
 * @Author: fangmingfu <fangmingfu@keep.com>
 * ******************************************************/


public class code7 {
    static class Solution {
        public int reverse(int x) {
            long res = 0;
            while(x != 0){
                res = res * 10 + x%10;
                x = x/10;
            }
            return  (res > Integer.MAX_VALUE-1 || res < Integer.MIN_VALUE) ? 0 : (int)res;
        }
    }

}
