package 剑指Offer;

/*
 *	输入一棵二叉树，求该树的深度。从根结点到叶结点依次经过的结点（含根、叶结点）形成树的一条路径，最长路径的长度为树的深度。
 */

public class Test38_二叉树的深度 {
	
	public static void main(String[] args) {
		TreeNode tree = new TreeNode(1);
		tree.left = new TreeNode(2);
		tree.right = new TreeNode(3);
		tree.left.left = new TreeNode(4);
		tree.left.right = new TreeNode(5);
		tree.right.left = new TreeNode(6);
		tree.right.right = new TreeNode(7);
		tree.right.left.left = new TreeNode(8);
		System.out.println(TreeDepth(tree));
	}
	
    public static int TreeDepth(TreeNode root) {
    	if(root == null){
    		return 0;
    	}
    	int left = TreeDepth(root.left);
    	int right = TreeDepth(root.right);
		return Math.max(left, right) + 1;
    }

}
