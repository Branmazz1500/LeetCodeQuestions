package easyQuestions;

import java.util.ArrayList;
import java.util.List;

public class ConvertBinaryInLinkedList {
	
	//  Definition for singly-linked list.
	  public static class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	  
	
	public static int getDecimalValue(ListNode head) {
	       List<Integer> nodes = new ArrayList<Integer>();
	        while(head != null){
	            nodes.add(head.val);
	            head = head.next;
	        }
	        int size = nodes.size();
	        int sum = 0;
	        for(int i = 0; i<size; i++){
	            int power = size-i-1;
	            if(nodes.get(i) != 0){
	                sum += Math.pow(2,power);
	            }
	          
	        }
	        return sum;
	    }
	
	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		node.next = new ListNode(1);
		node.next.next = new ListNode(0);
		node.next.next.next = new ListNode(1);
		
		System.out.println(getDecimalValue(node));
	}
}
