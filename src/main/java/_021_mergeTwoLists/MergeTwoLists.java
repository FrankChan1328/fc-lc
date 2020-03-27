package _021_mergeTwoLists;

public class MergeTwoLists {

    public static void main(String[] args) {
        // 1->2->4, 1->3->4
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l4 = new ListNode(4);
        l1.next = l2;
        l2.next = l4;

        ListNode ll1 = new ListNode(1);
        ListNode ll2 = new ListNode(3);
        ListNode ll4 = new ListNode(4);
        ll1.next = ll2;
        ll2.next = ll4;
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        
        // 注意每个链表的往下遍历的方式
        ListNode p = head;
        ListNode p1 = l1;
        ListNode p2 = l2;
        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                p.next = p1;
                p1 = p1.next;
            } else {
                p.next = p2;
                p2 = p2.next;
            }
            p = p.next;
        }

        if (p1 != null) {
            p.next = p1;
        }

        if (p2 != null) {
            p.next = p2;
        }

        return head.next;
    }
}
