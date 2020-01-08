package 剑指Offer;

/*
 *	操作给定的二叉树，将其变换为源二叉树的镜像。
 	二叉树的镜像定义：源二叉树 
    	    8
    	   /  \
    	  6   10
    	 / \  / \
    	5  7 9 11
    	镜像二叉树
    	    8
    	   /  \
    	  10   6
    	 / \  / \
    	11 9 7  5
 */
//思路：递归思想，先交换根节点的左右子树的位置，然后向下递归，把左右子树的根节点作为下次循环的根节点。
public class Test18_二叉树的镜像 {
	
	public static void main(String[] args) {
		TreeNode tree = new TreeNode(1);
		tree.left = new TreeNode(2);
		tree.right = new TreeNode(3);
		tree.left.left = new TreeNode(4);
		tree.left.right = new TreeNode(5);
		tree.right.left = new TreeNode(6);
		tree.right.right = new TreeNode(7);
		Mirror(tree);
	}
	
	public static void Mirror(TreeNode root) {
        if(root == null){
        	return ;
        }
        if(root.left == null && root.right == null){
        	return ;
        }
        //交换左右子树
        TreeNode temp = null;
        temp = root.left;
        root.left = root.right;
        root.right = temp;
        // 递归
        if(root.left != null){
        	Mirror(root.left);
        }
        if(root.right != null){
        	Mirror(root.right);
        }
    }

}
