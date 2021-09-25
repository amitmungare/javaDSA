package binaryTree;

public class PrintNodeAtDepthK {
	
	public static void printAtdepthK(TreeNode<Integer> root, int k) {
		if(root==null)return;
		
		if(k==0) {
			System.out.println(root.data+" ");
			return;
		}
		
		printAtdepthK(root.left, k-1);
		printAtdepthK(root.right, k-1);
	}

	public static void main(String[] args) {
		
	}

}
