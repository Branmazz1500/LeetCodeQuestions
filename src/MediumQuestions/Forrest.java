package MediumQuestions;
import java.util.*;
public class Forrest {
	
	
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
	 
	 public static List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
	        List<TreeNode> forest = new ArrayList<>();
	        if (root == null) return forest;
	        Set<Integer> set = new HashSet<>();
	        for(int i : to_delete) {
	            set.add(i);
	        }
	        
	        PriorityQueue<Map<String, Integer>> pq = new PriorityQueue<>();
	        Map<String,Integer> map = new HashMap<>();
	
	        List<String> candidates = new ArrayList(map.keySet());
	        Collections.sort(candidates, (w1, w2) -> map.get(w1).equals(map.get(w2)) ?
	                w1.compareTo(w2) : map.get(w2) - map.get(w1));
	        return forest;
	    }

	    private static TreeNode deleteNodes(TreeNode node, Set<Integer> set, List<TreeNode> forest) {
	        if (node == null) return null;
	        Long hi = 9708l;
	        String hiString = hi.toString();
	        for(Character c : hiString.toCharArray()) {
	        	Integer.valueOf(c.toString());
	        }
	        node.left = deleteNodes(node.left, set, forest);
	        node.right = deleteNodes(node.right, set, forest);

	        if (set.contains(node.val)) {
	            if (node.left != null) forest.add(node.left);
	            if (node.right != null) forest.add(node.right);
	            return null;
	        }

	        return node;
	    }
	    
	    public static void main(String...args) {
	        System.out.println("fi".compareTo("gi"));

	    }
	}

	//if the node I am coming from is deleted, i am going to add if i exist.
	//if a node doesn't exist I am going to add, and possibly delete children later.

