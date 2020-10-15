package easyAugust7th;

import java.util.ArrayList;
import java.util.List;

public class IncreaseOrderSearchTree {
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
		 
	 public static TreeNode increasingBST(TreeNode root) {
	        List<Integer> vals = new ArrayList();
	        inorder(root, vals);
	        TreeNode ans = new TreeNode(0), cur = ans;
	        for (int v: vals) {
	            cur.right = new TreeNode(v);
	            cur = cur.right;
	        }
	        return ans.right;
	    }

	    public static void inorder(TreeNode node, List<Integer> vals) {
	        if (node == null) return;
	        inorder(node.left, vals);
	        vals.add(node.val);
	        inorder(node.right, vals);
	    }
		    public static void main(String[] arg) {
		    	TreeNode root = new TreeNode(5);
		    	root.left = new TreeNode(3);
		    	root.right = new TreeNode(6);
		    	root.left.left = new TreeNode(2);
		    	root.left.right = new TreeNode(4);
		    	root.right.right = new TreeNode(8);
		    	root.left.left.left = new TreeNode(1);
		    	root.right.right.left = new TreeNode(7);
		    	root.right.right.right = new TreeNode(9);

		    	System.out.println(increasingBST(root));
		    	
		    }
}
