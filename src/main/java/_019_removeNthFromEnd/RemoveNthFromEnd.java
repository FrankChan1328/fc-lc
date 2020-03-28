package _019_removeNthFromEnd;

public class RemoveNthFromEnd {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(4);
		ListNode l5 = new ListNode(5);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;

		ListNode result = removeNthFromEnd(l1, 2);
		System.out.println(result);
	}

	/**
	 * 兩次遍历
	 */
	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		
		// 第一次遍历，得到链表的长度
		int length = 0;
		ListNode first = head;
		while (first != null) {
			length++;
			first = first.next;
		}
		
		// 哑节点作为辅助
		length -= n;
		first = dummy;
		while (length > 0) {
			length--;
			first = first.next;
		}
		// first 指针指向第 lenth -n 个节点，准备删除第n 个
		first.next = first.next.next;
		return dummy.next;
	}

	/**
	 * 一次遍历
	 * 我们可以使用两个指针而不是一个指针。
	 * 第一个指针从列表的开头向前移动 n+1 步，而第二个指针将从列表的开头出发。
	 * 现在，这两个指针被 n 个结点分开。
	 * 我们通过同时移动两个指针向前来保持这个恒定的间隔，直到第一个指针到达最后一个结点。
	 * 此时第二个指针将指向从最后一个结点数起的第 n 个结点。
	 * 我们重新链接第二个指针所引用的结点的 next 指针指向该结点的下下个结点。
	 */
	public ListNode removeNthFromEnd2(ListNode head, int n) {
	    ListNode dummy = new ListNode(0);
	    dummy.next = head;
	    ListNode first = dummy;
	    ListNode second = dummy;
	    // Advances first pointer so that the gap between first and second is n nodes apart
	    for (int i = 1; i <= n + 1; i++) {
	        first = first.next;
	    }
	    // Move first to the end, maintaining the gap
	    while (first != null) {
	        first = first.next;
	        second = second.next;
	    }
	    second.next = second.next.next;
	    return dummy.next;
	}
}
