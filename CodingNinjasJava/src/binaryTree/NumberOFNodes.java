package binaryTree;

public class NumberOFNodes {
	
	public static int numOfNodes(TreeNode<Integer> root) {
		if(root==null)return 0;
		
		int l = numOfNodes(root.left);
		int r = numOfNodes(root.right);
		
		return l+r+1;
		 
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
