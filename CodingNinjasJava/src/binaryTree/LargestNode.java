package binaryTree;

public class LargestNode {
	
	public static int LargestNodes(TreeNode<Integer> root) {
		if(root==null)return -1;
		
		int l = LargestNodes(root.left);
		int r = LargestNodes(root.right);
		
		return Math.max(root.data, Math.max(l, r));
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
