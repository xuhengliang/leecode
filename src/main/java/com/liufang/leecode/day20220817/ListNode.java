package com.liufang.leecode.day20220817;

/**
 * @author hengliang.xu@patpat.com
 * @decription
 * @date 2022-08-19-11-37
 */
public class ListNode {
    private int val;
    private ListNode next;
    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }
    public ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                '}';
    }
}
