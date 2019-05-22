package com.mac.rag;

public class AddTwoNumbers {

    public static void main(String args[]) {
//        Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
//        Output: 7 -> 0 -> 8
//        Explanation: 342 + 465 = 807.
        ListNode l1 = new ListNode(1999999999);
        ListNode l2 = new ListNode(9);
        ListNode l3 = addTwoNumbers(l1, l2);
        System.out.println(l3.val);
        while (l3.next != null) {
            l3 = l3.next;
            System.out.println(l3.val);
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Integer int1 = parseList(l1);
        Integer int2 = parseList(l2);
        Integer result = int1 + int2;
        return parseInteger(result);
    }

    public static Integer parseList(ListNode l) {
        int val = 0;
        if (l.next != null) {
            val = parseList(l.next);
        }
        return (l.val) + (val * 10);
    }

    public static ListNode parseInteger(Integer value) {
        if (value > 0) {
            ListNode node = new ListNode(value % 10);
            value = value / 10;
            node.next = parseInteger(value);
            return node;
        }
        return null;
    }


}
