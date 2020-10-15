package mediumQuestion;

public class SumOfDeepestNodesTree {
	
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

	static int deepestLevel = 0;

	public static int deepestLeavesSum(TreeNode root, int currentLevel, int sum) {
		if (root != null) {
			if (root.left != null || root.right != null) {
				currentLevel++;
				if (currentLevel > deepestLevel) {
					deepestLevel = currentLevel;
					sum = 0;
				}
				if (root.left != null) {
					sum = deepestLeavesSum(root.left, currentLevel, sum);
				}
				if (root.right != null) {
					sum = deepestLeavesSum(root.right, currentLevel, sum);
				}
			}
			if (root.left == null && root.right == null && currentLevel == deepestLevel) {
				sum += root.val;
			}
		}
		return sum;
	}

	public static int deepestLeavesSum(TreeNode root) {
		deepestLevel = 0;
		return deepestLeavesSum(root, 0, 0);
	}
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.left.left.left = new TreeNode(7);
		root.right.right = new TreeNode(6);
		root.right.right.right = new TreeNode(8);
		
		System.out.println(deepestLeavesSum(root));
		
	}
}
