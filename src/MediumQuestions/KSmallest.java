package MediumQuestions;



public class KSmallest {
	
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
	static int count = 0;
	static int value = 0;
	 public static int kthSmallest(TreeNode root, int k) {
		 	inOrderTraversal(root,k);
	        return value;
	    }
	    
	    public static void inOrderTraversal(TreeNode root, int k){
	        if(root != null){
	            inOrderTraversal(root.left,k);  
	            count++;
	            if(count == k) value = root.val; 
	            if(value == 0) inOrderTraversal(root.right,k);
	        }
	        
	    }
	    
	    public static void main(String[] args) {
	    	TreeNode root = new TreeNode(5);
	    	root.left = new TreeNode(3);
	    	root.right = new TreeNode(6);
	    	root.left.left = new TreeNode(2);
	    	root.left.left.left = new TreeNode(1);
	    	root.left.right = new TreeNode(4);
	    	
	    	System.out.println(kthSmallest(root,3));
	    }
}
