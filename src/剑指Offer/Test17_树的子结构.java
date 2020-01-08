package 剑指Offer;

/*
 *	输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */
/*
 	思路：用递归来实现，从A树的根节点开始，判断其所有的节点是不是依次和树B相同，
 	如不同，递归调用函数，继续判断树A当前节点的左子树的所有节点或右子树的所有节点是否和树B所有节点相同，直到遍历到父树A的叶子节点，
 	如果不是完全相同，则树B不是树A子树，如果直到遍历到树B的叶子节点，其所有节点在树A中均有，则树B是树A的子树。
	isSubtree(root1 , root2)  ||  HasSubtree(root1.left , root2)  ||  HasSubtree(root1.right , root2);
	//判断树A所有的节点是不是依次和树B相同，或树A的左子树的所有节点或右子树的所有节点    是否和树B所有节点相同
	isSubtree ( root1.left , root2.left ) && isSubtree ( root1.right , root2.right );
*/
public class Test17_树的子结构 {
	
	public static void main(String[] args) {
		TreeNode tree = new TreeNode(1);
		tree.left = new TreeNode(2);
		tree.right = new TreeNode(3);
		tree.left.left = new TreeNode(4);
		tree.left.right = new TreeNode(5);
		tree.right.left = new TreeNode(6);
		tree.right.right = new TreeNode(7);
		TreeNode tree2 = new TreeNode(2);
		tree2.left = new TreeNode(4);
		tree2.right = new TreeNode(5);
		boolean subtree = HasSubtree(tree,tree2);
		System.out.println(subtree);
	}
	
	public static boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1 == null || root2 == null){
            return false;
        }
		return isSubtree(root1, root2) || HasSubtree(root1.left, root2) || HasSubtree(root1.right, root2);
    }

	public static boolean isSubtree(TreeNode root1, TreeNode root2) {
		if(root2 == null){
            return true;
        }
        if(root1 == null){
            return false;
        }
        if(root1.val == root2.val){
            return isSubtree(root1.left, root2.left) && isSubtree(root1.right, root2.right);
        }
		return false;
	}

}
