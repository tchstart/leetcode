package com.tch.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author : tchstart
 * @version v1.0
 * @ClassName: Solution
 * @Description: TODO(一句话描述该类的信息)
 * @date : 2023-04-30 09:49
 **/

class Solution {
    Stack<ListNode> stack = new Stack<>();
    public ListNode reverseList(ListNode head) {
        while(head.next != null){
            stack.add(head);
            head =  head.next;
        }
        ListNode h = new ListNode();
        ListNode n = h;
        while(!stack.isEmpty()){
            ListNode listNode = stack.pop();
            listNode.next = null; // 防止 Error - Found cycle in the ListNode
            h.next = listNode;
            h = h.next;
        }
        return n.next;
    }
}
