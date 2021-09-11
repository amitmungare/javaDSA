package binaryTree;

public class NumberOfLeafNodes {
	
	public static int numOfLeaf(TreeNode<Integer> root) {
		
		if(root==null)return 0;
		
		if(root.left==null && root.right==null)return 1;
		
		return numOfLeaf(root.left)+numOfLeaf(root.right);
		
	}

	public static void main(String[] args) {
		
	}

}
