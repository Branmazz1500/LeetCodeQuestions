package MediumQuestions;

import java.util.ArrayList;
import java.util.List;

import MediumQuestions.KSmallest.TreeNode;

public class BSTITerator {

	public static class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	}
	
	  	static List<Integer> inOrder = new ArrayList<Integer>();
	    static int pos;
	    
	    public static List<Integer> inOrderTraverse(TreeNode root, List<Integer> list){
	        if(root != null){
	            list = inOrderTraverse(root.left, list);
	            list.add(root.val);
	            list = inOrderTraverse(root.right, list);
	        }
	        return list;
	    }
	    
	    public BSTITerator(TreeNode root) {
	       inOrder = inOrderTraverse(root, inOrder);
	       pos = 0;
	    }
	    
	    /** @return the next smallest number */
	    public static int next() {
	        return inOrder.get(pos++);
	    }
	    
	    /** @return whether we have a next smallest number */
	    public static boolean hasNext() {
	        return pos < inOrder.size()-1;
	    }
	    
	    public static void main(String[] args) {
	    	TreeNode root = new TreeNode(5);
	    	root.left = new TreeNode(3);
	    	root.right = new TreeNode(6);
	    	root.left.left = new TreeNode(2);
	    	root.left.left.left = new TreeNode(1);
	    	root.left.right = new TreeNode(4);
	    	
	    	BSTITerator bst = new BSTITerator(root);
	    	System.out.println(bst.next());
	    	System.out.println(bst.next());
	    	System.out.println(bst.hasNext());

	    	
	    }
}
