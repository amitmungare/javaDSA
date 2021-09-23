package binaryTree;

import java.util.Scanner;

import queue.QueueLL;

public class PrintLevelWise {

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
	
	public static void printLevelWise(TreeNode<Integer> root) {
		
		if(root==null)return;
		
		QueueLL<TreeNode<Integer>> q = new QueueLL<>();
		q.enqueue(root);
		
		while(!q.isEmpty()) {
			
			TreeNode<Integer> front = q.dequeue();
			
			System.out.print(front.data+":");
			
			if(front.left==null) {
				System.out.print("L:-1,");
			}else {
				System.out.print("L:"+front.left.data+",");
				q.enqueue(front.left);
			}
			
			if(front.right==null) {
				System.out.print("R:-1");
			}else {
				System.out.print("R:"+front.right.data);
				q.enqueue(front.right);
			}
			System.out.println();
			
		}
		
	}
	
	public static void main(String[] args) {
		
		TreeNode<Integer> root = inputLW();
		printLevelWise(root);
		
	}
	
}
