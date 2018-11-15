import java.util.List;

/*******************************************************
 * Copyright (C) 2018 KEEP.COM - All Rights Reserved
 *
 * @Date: 2018/11/12
 * @Author: fangmingfu <fangmingfu@keep.com>
 * ******************************************************/


public class code19 {

      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode fast = head;
            ListNode slow = head;
            ListNode pre = null;
            while (n > 0){
                n--;
                fast = fast.next;
            }
            while (fast != null){
                pre = slow;
                fast = fast.next;
                slow = slow.next;
            }
            if (pre == null){
                return slow.next;
            }else{
                pre.next = slow.next;
                return head;
            }
        }
    }
}
