package binaryTree;

import java.util.Scanner;

import queue.QueueLL;

public class MirrorBinaryTree {
	
	public static void mirror(TreeNode<Integer> root){
		
		if(root==null)return;
		
		TreeNode<Integer> temp = root.left;
		root.left = root.right;
		root.right = temp;
		
		mirror(root.left);
		mirror(root.right);
		
		
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
	
	public static void printLW(TreeNode<Integer> root) {
		
		QueueLL<TreeNode<Integer>> q = new QueueLL<>();
		q.enqueue(root);
		q.enqueue(null);
		
		while(!q.isEmpty()) {
			TreeNode<Integer> front  =q.dequeue();
			if(front == null) {
				if(q.isEmpty())break;
				System.out.println();
				q.enqueue(null);
			}else {
				System.out.print(front.data+" ");
				if(front.left != null)q.enqueue(front.left);
				if(front.right != null)q.enqueue(front.right);
			}
		}
		
	}

	
	
	public static void main(String[] args) {
		
		TreeNode<Integer> root = inputLW();
		mirror(root);
		printLW(root);
		
	}

}
