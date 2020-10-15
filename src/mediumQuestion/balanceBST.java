package mediumQuestion;

import java.util.ArrayList;
import java.util.List;

public class balanceBST {
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
	  public static List<Integer> inOrder(TreeNode root, List<Integer> list){
	        if(root != null){
	            list = inOrder(root.left,list);
	            list.add(root.val);
	            list = inOrder(root.right,list);
	        }
	        return list;
	    }
	    
	    public static TreeNode buildBst(List<Integer> elements,int start,int end){
	       	TreeNode root = null;
	    	if(start<=end){
	            int middle = (start + end)/2;
	            root = new TreeNode(elements.get(middle));
	            root.left = buildBst(elements, start,middle-1);
	            root.right = buildBst(elements, middle+1,end);
	            return root;
	        }
	        return null;
	    }
	    
	    public static TreeNode balanceBSTs(TreeNode root) {
	        List<Integer> elements = inOrder(root, new ArrayList<Integer>());
	        return buildBst(elements, 0, elements.size()-1);
	    }
	    public static int pruneTree(TreeNode root, int sum){
	        
	        if(root != null){
	            sum = root.val;
	            sum += pruneTree(root.left,0);
	            sum += pruneTree(root.right,0);
	        }
	       
	         return sum;
	     }
	     public static TreeNode pruneTree(TreeNode root) {
	    	 if(root != null) {
	    		 deleteTree(root);
	    	 }
	    	 return root;
	     }
	     public static TreeNode deleteTree(TreeNode root) {
	    	 int sum = 0;
	    	 if(root != null) {
	    		 sum = pruneTree(root, 0);
	    	 }
	    	 if(sum < 1) {
	    		 return null;
	    	 }
	    	 return root;
	     }
	    public static void main(String[] args) {
	    	TreeNode root = new TreeNode(1);
	    	root.right = new TreeNode(0);
	    	root.right.left = new TreeNode(0);
	    	root.right.right = new TreeNode(1);
	    	System.out.println(pruneTree(root));
	    }
}
