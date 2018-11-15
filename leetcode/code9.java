import java.util.ArrayList;
import java.util.List;

/*******************************************************
 * Copyright (C) 2018 KEEP.COM - All Rights Reserved
 *
 * @Date: 2018/11/12
 * @Author: fangmingfu <fangmingfu@keep.com>
 * ******************************************************/


public class code9 {

    class Solution {
        public boolean isPalindrome(int x) {
            if(x < 0){
                return false;
            }
            List<Integer> list = new ArrayList<>();
            while (x != 0){
                list.add(x%10);
                x /= 10;
            }
            int start = 0;
            int end = list.size() - 1;
            while (start <= end){
                if(list.get(start) != list.get(end)){
                    return false;
                }
                start ++;
                end --;
            }
            return true;
        }
    }
}
