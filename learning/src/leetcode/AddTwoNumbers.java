package leetcode;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class AddTwoNumbers {

    //Definition for singly-linked list.
    public class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    public static void main(String[] args) {

        ListNode l1 =  new AddTwoNumbers().new ListNode(2);

        ListNode node1 =  new AddTwoNumbers().new ListNode(4);
        l1.next = node1;

        ListNode node2 =  new AddTwoNumbers().new ListNode(3);
        node1.next = node2;

        /*
        *
        * */
        ListNode l2 =  new AddTwoNumbers().new ListNode(5);

        ListNode node3 =  new AddTwoNumbers().new ListNode(6);
        l2.next = node3;

        ListNode node4 =  new AddTwoNumbers().new ListNode(4);
        node3.next = node4;

        new AddTwoNumbers().addTwoNumbers(l1, l2);
    }
    public ListNode head = null;
    public ListNode tail = null;
    private static BigInteger n1 = null;
    private ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode current = l1;
        boolean flag = false;
        String n = "";
        while (current != null) {
            n += current.val;
            current = current.next;

            if (current == null) {
                addInt(getInt(n));
                if (flag) break;
                current = l2; n = ""; flag = true;
            }
        }
        String r =  n1 + "";
        for (int i = r.length() - 1; i >= 0; i--) {
            addNode(Integer.parseInt(r.charAt(i) + ""));
        }
        n1 = null;
        return head;
    }

    private void addInt(BigInteger n) {
        if (n1 == null) {
            n1 = n;
        } else {
           n1 = n1.add(n);
        }
    }
    private BigInteger getInt(String n) {
        return new BigInteger(new StringBuffer(n).reverse() + "");
    }
    private void addNode(int data) {
        ListNode newNode = new ListNode(data);

        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }
}
