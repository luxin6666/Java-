package 剑指Offer;

/*
 *	输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 */

public class Test39_平衡二叉树 {
	
	public static void main(String[] args) {
		TreeNode tree = new TreeNode(1);
		tree.left = new TreeNode(2);
		tree.right = new TreeNode(3);
		tree.left.left = new TreeNode(4);
		tree.left.right = new TreeNode(5);
		tree.right.left = new TreeNode(6);
		//tree.right.right = new TreeNode(7);
		tree.right.left.left = new TreeNode(8);
		System.out.println(IsBalanced_Solution(tree));
	}
	
    public static boolean IsBalanced_Solution(TreeNode root) {
    	if(root == null){
    		return true;
    	}
    	int left = balanced_Num(root.left);
    	int right = balanced_Num(root.right);
    	if(Math.abs(left-right) > 1){
    		return false;
    	}
		return true;
    }
    
    public static int balanced_Num(TreeNode root){
    	if(root == null){
    		return 0;
    	}
    	int left = balanced_Num(root.left);
    	int right = balanced_Num(root.right);
		return left>right ? (left+1) : (right+1);
    }
    
}
