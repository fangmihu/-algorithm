/*******************************************************
 * Copyright (C) 2018 KEEP.COM - All Rights Reserved
 *
 * @Date: 2018/11/14
 * @Author: fangmingfu <fangmingfu@keep.com>
 * ******************************************************/


public class code74 {

    class Solution {
        public boolean searchMatrix(int[][] matrix, int target) {
            if(matrix.length == 0) return false;
            int x = matrix[0].length - 1;
            int y = 0;
            while (x >= 0 && y < matrix.length ){
                if(matrix[y][x] == target){
                    return true;
                }
                if( target < matrix[y][x] ){
                    x--;
                }else{
                    y++;
                }
            }
            return false;

        }
    }
}
