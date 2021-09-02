package binaryTree;

import queue.QueueLL;

public class ConstructTreeFromPostorderAndInorder {

public static TreeNode<Integer> con(int in[], int po[], int inS, int inE, int poS, int poE){
		
		if(inS>inE)return null;
		
		int rootdata = po[poE];
		
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
		int leftpoS = poS;
		int leftpoE = leftinE - leftinS + leftpoS;
		int rightinS = rootInIndex+1;
		int rightinE = inE;
		int rightpoS = leftpoE+1;
		int rightpoE = rightinE - rightinS + rightpoS;
		
		root.left = con(in, po, leftinS, leftinE, leftpoS, leftpoE);
		root.right = con(in, po, rightinS, rightinE, rightpoS, rightpoE);
		
		return root;
		
	}
	

	public static TreeNode<Integer> conTree(int in[], int po[]){
		return con(in, po, 0, in.length-1, 0, po.length-1);
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
		
		int in[] = {4,8,2,5,1,6,3,7};
		int po[] = {8,4,5,2,6,7,3,1};
	    	    
	    TreeNode<Integer> root = conTree(in, po);
	    printLW(root);
	    
	}
	
}
