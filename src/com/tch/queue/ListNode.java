package com.tch.queue;

/**
 * @author : tchstart
 * @version v1.0
 * @ClassName: ListNode
 * @Description: TODO(一句话描述该类的信息)
 * @date : 2023-04-30 09:50
 **/
public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}