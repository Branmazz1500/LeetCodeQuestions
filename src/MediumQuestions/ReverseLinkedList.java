package MediumQuestions;

import java.util.Stack;

public class ReverseLinkedList {
	 public static class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
		 
	 		//1-> 2-> 3->4->5->NULL
		    public static ListNode reverseList(ListNode head) { 
		        ListNode prev = null;
		        ListNode curr = head;
		        while(curr != null){
		        	ListNode temp = curr.next;
		        	curr.next = prev;
		        	prev = curr;
		        	curr = temp;
		        	
		        }
		        
		        
		        return prev;
		    }
		    
		    
		    
		    public static void deleteNode(ListNode node) {
		    	String h = "5";
		    	Integer a = (Integer.parseInt("5") + Integer.parseInt("6"));
		    	a.toString();
		        ListNode curr = node;
		        while(curr != null){
		            if(curr.next == null){
		                curr = null;
		            }else{
		                curr.val = curr.next.val;
		                curr = curr.next;
		            }
		        }
		    }
		    
		    public static ListNode removeElements(ListNode head, int val) {
		        ListNode current = head;
		        while(current != null){
		          while(current.next != null && current.next.val == val){
		              if(current.next != null && current.next.next != null){
		                  current.next = current.next.next;
		              }else if(current.next != null && current.next.next == null) {
		            	  current.next = null;
		              }
		          }
		            current = current.next;
		            if(current != null && current.val == val){
			            current = null;
			        }
		        }
		       
		        
		        return head;
		    }
		
		
		public static void main(String[] args) {
			ListNode linkedList = new ListNode(1);
			linkedList.next = new ListNode(2);
			linkedList.next.next = new ListNode(6);
			linkedList.next.next.next = new ListNode(3);
			linkedList.next.next.next.next = new ListNode(4);
			linkedList.next.next.next.next.next = new ListNode(5);
			linkedList.next.next.next.next.next.next = new ListNode(6);




//			
//			deleteNode(linkedList.next);
//			String s = "9999999991";
//			Stack<Integer> s = new Stack<Integer>();
//			s.si
			removeElements(linkedList, 6);
			System.out.println(Long.parseLong("9999999991"));
			
		}
}
