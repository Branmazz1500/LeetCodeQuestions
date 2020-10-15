package mediumQuestion;

public class MergeTwoLL {

	public static class ListNode {
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

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode mergedList;
		while (l1 != null && l2 != null) {
		
			if (l1.val <= l2.val) {
				l1 = l1.next;
			} else {
				ListNode placeHolder = l1.next;
				l1.next = l2;
				l1 = l1.next;
				l2 = l2.next;
				l1.next = placeHolder;
				l1 = l1.next;

			}
		}
		return l1;
	}
	
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(4);
		
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		
		System.out.println(mergeTwoLists(l1,l2));
	}
}
