package binaryTree;

import java.util.Scanner;

import queue.QueueLL;

public class DiameterOfBT {


	public static Pair<Integer, Integer> diameter(TreeNode<Integer> root){
		
		if(root==null) {
			Pair<Integer, Integer> op = new Pair<>();
			op.first=0;
			op.second=0;
			return op;
		}
		
		Pair<Integer, Integer> lo = diameter(root.left);
		Pair<Integer, Integer> ro = diameter(root.right);
		
		int height = Math.max(lo.first, ro.first)+1;
		
		int opt1 = lo.first + ro.first;
		int opt2 = lo.second;
		int opt3 = ro.second;		
		int diameter = Math.max(opt1, Math.max(opt2, opt3));
		
		Pair<Integer, Integer> op = new Pair<>();
		op.first=height;
		op.second=diameter;
		return op;
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
		
		System.out.println("height= " + diameter(root).first);
		System.out.println("diameter= "+ diameter(root).second);
		
		printLW(root);
		
	}

}
