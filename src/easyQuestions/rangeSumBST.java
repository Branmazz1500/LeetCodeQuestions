package easyQuestions;

public class rangeSumBST {
	/**
	 * 
	 *Definition for a binary tree node.
	 */
	public class TreeNode {
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
	 public int rangeSumBSTa(TreeNode root, int L, int R) {
	        int sum = 0;
	        if(root.val >= L && root.val <= R){
	            sum = root.val;
	        }
	        if(root.left != null){
	            sum += rangeSumBSTa(root.left,L,R);
	        }
	        if(root.right != null){
	            sum += rangeSumBSTa(root.right,L,R);
	        }
	        
	        return sum;
	    }
	
	
}
