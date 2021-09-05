package binaryTree;

import java.util.Scanner;

import queue.QueueLL;

public class IsBalanced {
	
	public static int height(TreeNode<Integer> root) {
		if(root==null)return 0;
		return Math.max(height(root.left), height(root.right))+1;	
	}
	
	public static boolean isBalance(TreeNode<Integer> root) {
		if(root==null)return true;
		
		if(height(root.left)==height(root.right)) {
			if(isBalance(root.left) && isBalance(root.right)) {
				return true;
			}
		}
		return false;
	}
	
	
	public static TreeNode<Integer> inputLW(){
		Scanner sc = new Scanner(System.in); 
		QueueLL<TreeNode<Integer>> pendingNode = new QueueLL<>();
		
		int rootdata = sc.nextInt();
		if(rootdata == -1)return null;
		
		TreeNode<Integer> root = new TreeNode<Integer>(rootdata);
		pendingNode.enqueue(root);
		
		while(!pendingNode.isEmpty()) {
			TreeNode<Integer> front = pendingNode.dequeue();
			
			int leftchild = sc.nextInt();
			if(leftchild != -1) {
				TreeNode<Integer> child = new TreeNode<Integer>(leftchild);
				pendingNode.enqueue(child);
				front.left = child;
			}
			
			int rightchild = sc.nextInt();
			if(rightchild != -1) {
				TreeNode<Integer> child = new TreeNode<Integer>(rightchild);
				pendingNode.enqueue(child);
				front.right = child;
			}		
		}
		return root;
	}

	public static void main(String[] args) {
		
		TreeNode<Integer> root  = inputLW();
		
		System.out.println(isBalance(root));
		
	}

}
