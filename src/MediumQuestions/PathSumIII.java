package MediumQuestions;

import java.util.HashMap;
import java.util.Map;

public class PathSumIII {

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public static int pathSum(TreeNode root, int target) {
		int count = 0;
		if (root == null)
			return count;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, 1);
		count = getSums(map, root, 0, target);

		return count;
	}

	public static int getSums(Map<Integer, Integer> map, TreeNode root, int sum, int target) {
		if (root == null)
			return 0;

		sum += root.val;
		int count = map.getOrDefault(sum - target, 0);
		map.put(sum, map.getOrDefault(sum, 0) + 1);
		count += getSums(map, root.left, sum, target) + getSums(map, root.right, sum, target);
		map.put(sum, map.get(sum) - 1);
		return count;
	}
	
	public static void main(String... args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(-2);
		root.right = new TreeNode(-3);
		System.out.println(pathSum(root,-1));
	}

}
