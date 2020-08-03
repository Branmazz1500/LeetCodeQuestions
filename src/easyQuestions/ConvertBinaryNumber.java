package easyQuestions;

public class ConvertBinaryNumber {
	/**
	  Definition for singly-linked list.
	 */
	
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	  
	  public int getDecimalValue(ListNode head) {
		  int number = head.val;
		  while(head.next != null) {
			  number = number *10+head.next.val;
		  }
		  return number;
	  }
	 
	 public static void main(String[] args) {
		
	 }

}
