package MediumQuestions;

import java.util.LinkedList;
import java.util.Queue;


public class BankRobberIII {
	
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
		      
	  public static int rob(TreeNode root) {
	        boolean even = false;
	        int evenSum = 0;
	        int oddSum = 0;
	        Queue<TreeNode> q = new LinkedList<TreeNode>();
	        q.add(root);
	        while(!q.isEmpty()){
	            int sum = 0;
	            for(int i = 0; i<q.size(); i++){
	                TreeNode curr = q.poll();
	                sum += curr.val;
	                if(curr.left != null){
	                    q.offer(curr.left);
	                }
	                if(curr.right != null){
	                    q.offer(curr.right);
	                }
	            }
	            if(even){
	                evenSum += sum;
	                even = false;
	            }else{
	                oddSum += sum;
	                even = true;
	            }
	        }
	        return Math.min(evenSum, oddSum);
	    }
	 
	 public static void main(String[] args) {
		 TreeNode root = new TreeNode(3);
		 root.right = new TreeNode(3);
		 root.left = new TreeNode(2);
		 root.left.right = new TreeNode(3);
		 root.right.right = new TreeNode(1);
		 rob(root);
		 System.out.println();
	 }
}
