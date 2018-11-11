import java.util.List;

/*******************************************************
 * Copyright (C) 2018 KEEP.COM - All Rights Reserved
 *
 * @Date: 2018/10/29
 * @Author: fangmingfu <fangmingfu@keep.com>
 * ******************************************************/


public class code2 {

    /**
     * Definition for singly-linked list.
     */
     public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
     }

     //尽量不要用这种方法，因为数据长度可能会超过int或者long的位数，最好每一位都进行判断然后进位
    static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int sum = parseInt(l1) + parseInt(l2);
            return parseListNode(sum);
        }
        public int parseInt(ListNode listNode){
            int res = 0;
            int base = 1;
            while (listNode != null){
                res += base * listNode.val;
                base *= 10;
                listNode = listNode.next;
            }
            return res;
        }

        public ListNode parseListNode(int num){
            ListNode res = new ListNode(num % 10);
            num = num /10;
            ListNode temp = res;
            while (num != 0){
                temp.next = new ListNode(num % 10);
                temp = temp.next;
                num = num / 10;
            }
            return res;
        }
    }

    public static void main(String[] args) {
         ListNode listNode = new ListNode(1);
         listNode.next = new ListNode(9);
        listNode.next.next = new ListNode(9);

        listNode.next.next.next = new ListNode(9);
        listNode.next.next.next.next = new ListNode(9);
        listNode.next.next.next.next.next = new ListNode(9);
        listNode.next.next.next.next.next.next = new ListNode(9);
        listNode.next.next.next.next.next.next.next = new ListNode(9);

         ListNode listNode1 = new ListNode(9);
        Solution solution = new Solution();
        System.out.println(solution.parseInt(solution.addTwoNumbers(listNode, listNode1)));
//        System.out.println(solution.parseInt(solution.parseListNode(9)));
    }



}
