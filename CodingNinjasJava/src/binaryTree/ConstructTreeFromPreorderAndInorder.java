package binaryTree;

import queue.QueueLL;

public class ConstructTreeFromPreorderAndInorder {
	
	public static TreeNode<Integer> con(int in[], int pr[], int inS, int inE, int prS, int prE){
		
		if(inS>inE)return null;
		
		int rootdata = pr[prS];
		
		TreeNode<Integer> root = new TreeNode<Integer>(rootdata);
		
		int rootInIndex = -1;
		
		for(int i=inS; i<=inE; i++) {
			if(in[i]==rootdata) {
				rootInIndex = i;
				break;
			}
		}
		if(rootInIndex==-1)return null;
		
		int leftinS = inS;
		int leftinE = rootInIndex-1;
		int leftprS = prS+1;
		int leftprE = leftinE-leftinS+leftprS;
		int rightinS = rootInIndex+1;
		int rightinE = inE;
		int rightprS = leftprE+1;
		int rightprE = prE;
		
		root.left = con(in, pr, leftinS, leftinE, leftprS, leftprE);
		root.right = con(in, pr, rightinS, rightinE, rightprS, rightprE);
		
		return root;
		
	}
	

	public static TreeNode<Integer> conTree(int in[], int pr[]){
		return con(in, pr, 0, in.length-1, 0, pr.length-1);
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
		
		int in[] = {4, 15, 3, 2, 5, 1, 6, 10, 8, 7, 9, 12};
		int pr[] = {1, 2, 3, 4, 15, 5, 6, 7, 8, 10, 9, 12};
	    	    
	    TreeNode<Integer> root = conTree(in, pr);
	    printLW(root);
	    
	}
	

}
