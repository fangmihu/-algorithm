import org.omg.CosNaming.NameHelper;

/*******************************************************
 * Copyright (C) 2018 KEEP.COM - All Rights Reserved
 *
 * @Date: 2018/11/13
 * @Author: fangmingfu <fangmingfu@keep.com>
 * ******************************************************/


public class code105 {
      public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    class Solution {
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            return null;
        }

        public TreeNode solution(int pre, int inStart, int inEnd, int[] preorder, int[] inorder){
            //BaseCase
            TreeNode root = new TreeNode(preorder[pre]);
            int index = inStart;
            for(int i = inStart; i < inEnd; i ++){
                if(inorder[i] == preorder[pre]){}

            }
            return root;
        }
    }
}
