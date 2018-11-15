/*******************************************************
 * Copyright (C) 2018 KEEP.COM - All Rights Reserved
 *
 * @Date: 2018/11/13
 * @Author: fangmingfu <fangmingfu@keep.com>
 * ******************************************************/


public class code100 {

    /**
     * Definition for a binary tree node.
     */
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            if(p == null && q == null){
                return true;
            }
            if(p == null || q == null){
                return false;
            }
            return p.val == q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }

    }
}
