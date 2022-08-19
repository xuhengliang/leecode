package com.liufang.leecode.day20220817;

import java.util.*;

/**
* @author hengliang.xu@patpat.com
* @decription
* @date 2022-08-16-12-08
 */
public class AddTwoNum {

    public static void main(String[] args) {
//        ListNode l1Node1 = new ListNode(3);
//        ListNode l1Node2 = new ListNode(4,l1Node1);
//        ListNode l1Node3 = new ListNode(2,l1Node2);
//
//        ListNode l2Node1 = new ListNode(4);
//        ListNode l2Node2 = new ListNode(6,l2Node1);
//        ListNode l2Node3 = new ListNode(5,l2Node2);
//        ListNode result = addTwoNum(l1Node3, l2Node3);

//        ListNode l1Node1 = new ListNode(0);
//        ListNode l2Node1 = new ListNode(0);
//        ListNode result = addTwoNum(l1Node1, l2Node1);

        ListNode l1Node1 = new ListNode(9);
        ListNode l1Node2 = new ListNode(9,l1Node1);
        ListNode l1Node3 = new ListNode(9,l1Node2);
        ListNode l1Node4 = new ListNode(9,l1Node3);
        ListNode l1Node5 = new ListNode(9,l1Node4);
        ListNode l1Node6 = new ListNode(9,l1Node5);
        ListNode l1Node7 = new ListNode(9,l1Node6);

        ListNode l2Node1 = new ListNode(9);
        ListNode l2Node2 = new ListNode(9,l2Node1);
        ListNode l2Node3 = new ListNode(9,l2Node2);
        ListNode l2Node4 = new ListNode(9,l2Node3);

        ListNode result = addTwoNum(l1Node7, l2Node4);

        System.out.println(result);
        ListNode node = result.getNext();
        while (node != null){
            System.out.println(node);
            node = node.getNext();
        }
    }

    private static ListNode addTwoNum(ListNode l1, ListNode l2) {
        // 头
        ListNode head = null;
        // 尾
        ListNode tail = null;
        //  变量跟踪进位
        int carry = 0;

        while (l1 != null || l2 != null) {
            int n1 = l1 != null ? l1.getVal() : 0;
            int n2 = l2 != null ? l2.getVal() : 0;
            // 1. 3 + 4 + 0 = 7
            // 2. 4 + 6 + 0 = 10 % 10 = 0（取模）
            // 3. 2 + 5 + 1(进位) = 8
            int sum = n1 + n2 + carry;
            ListNode listNode = new ListNode(sum % 10);
            if (head == null) {
                head = listNode;
                // 如果头都还没有 那尾肯定也还没有 直接设置为头对象
                tail = listNode;
            } else {
                // 设置下一个值
                tail.setNext(listNode);
                // 指针往后指一位
                tail = tail.getNext();
            }
            // 替换进位 如果sum<10则无进位
            carry = sum / 10;

            // 循环指针
            if (l1 != null) {
                l1 = l1.getNext();
            }
            if (l2 != null) {
                l2 = l2.getNext();
            }
        }
        // 如果进制位还有数据 说明需要新增一个节点 1
        if (carry == 1) {
            tail.setNext(new ListNode(carry));
        }

        return head;
    }

}
