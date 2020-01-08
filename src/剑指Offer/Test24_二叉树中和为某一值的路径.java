package 剑指Offer;

import java.util.ArrayList;

/*
 *	输入一颗二叉树的根节点和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 *	路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。(注意: 在返回值的list中，数组长度大的数组靠前)
 */

public class Test24_二叉树中和为某一值的路径 {
	
	private static ArrayList<ArrayList<Integer>> pathList = new ArrayList<ArrayList<Integer>>();
	private static ArrayList<Integer> path = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		TreeNode tree = new TreeNode(1);
		tree.left = new TreeNode(2);
		tree.right = new TreeNode(3);
		tree.left.left = new TreeNode(4);
		tree.left.right = new TreeNode(5);
		tree.right.left = new TreeNode(6);
		tree.right.right = new TreeNode(7);
		ArrayList<ArrayList<Integer>> list = FindPath(tree,8);
		for (ArrayList<Integer> arrayList : list) {
			System.out.println(arrayList.toString());
		}
	}

	public static ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
		if(root == null){
			return pathList;
		}
		path.add(root.val);
		if(root.left == null && root.right == null && target == root.val){
			pathList.add(new ArrayList<Integer>(path));
		}
		if(root.val <= target && root.left != null){
			FindPath(root.left, target-root.val);
		}
		if(root.val <= target && root.right != null){
			FindPath(root.right, target-root.val);
		}
		path.remove(path.size()-1);
		return pathList;
    }
	
}
