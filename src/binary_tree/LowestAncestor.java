package binary_tree;

public class LowestAncestor {
	public TreeNode lowestAncestor(TreeNode root, TreeNode n1, TreeNode n2){
		if(root == null || n1 == null || n2 == null){
			return root;
		}
		TreeNode left = lowestAncestor(root.getLeft(), n1, n2);
		TreeNode right = lowestAncestor(root.getRight(), n1, n2);
		if(left != null && right != null){
			return root;
		}
		return left == null? right : left;
	}
}
