import java.nio.channels.MulticastChannel;

/*******************************************************
 * Copyright (C) 2018 KEEP.COM - All Rights Reserved
 *
 * @Date: 2018/11/14
 * @Author: fangmingfu <fangmingfu@keep.com>
 * ******************************************************/


public class code337 {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    class Solution {
        public int rob(TreeNode root) {
            if(root == null) return 0;
            return Math.max(yes(root), no(root));
        }
        public int yes(TreeNode root){
            if(root == null) return 0;
            return no(root.left) + no(root.right) + root.val;
        }
        public int no(TreeNode root){
            if(root == null) return 0;
            return rob(root.left) + rob(root.right);
        }
    }
}
