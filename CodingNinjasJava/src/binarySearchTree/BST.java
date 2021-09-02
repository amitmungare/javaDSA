package binarySearchTree;

import binaryTree.TreeNode;

class BSTDeleteReturn{
	TreeNode<Integer> root;
	boolean deleted;
	
	public BSTDeleteReturn(TreeNode<Integer> root, boolean deleted) {
		this.root=root;
		this.deleted = deleted;
	}
}

public class BST {

	private TreeNode<Integer> root;
	private int size;
	
	private static int max(TreeNode<Integer> root) {
		if(root==null)return -1;
		
		int l = max(root.left);
		int r = max(root.right);
		
		return Math.max(root.data, Math.max(l, r));
		 
	}
	
	public boolean isPresent(int x) {
		return presentHelper(root, x);
	}

	private static boolean presentHelper(TreeNode<Integer> root2, int x) {
		if(root2==null)return false;
		
		if(root2.data==x)return true;
		
		if(x<root2.data) {
			return presentHelper(root2.left, x);
		}else {
			return presentHelper(root2.right, x);
		}
	}
	
	public void insert(int x) {
		root = insertHelper(root, x);
		size++;
	}
	
	private static TreeNode<Integer> insertHelper(TreeNode<Integer> root2, int x) {
		
		if(root2 == null) {
			TreeNode<Integer> node = new TreeNode<Integer>(x);
			return node;
		}
		
		if(x<root2.data) {
			root2.left = insertHelper(root2.left, x);
		}else {
			root2.right = insertHelper(root2.right, x);
		}
		return root2;
	}

	public boolean delete(int x) {
		BSTDeleteReturn op = deleteHelper(root, x);
		root = op.root;
		if(op.deleted)size--;
		return op.deleted;
	}	
	private BSTDeleteReturn deleteHelper(TreeNode<Integer> root2, int x) {
		
		if(root==null)return new BSTDeleteReturn(null, false);
		
		if(root.data <x) {
			BSTDeleteReturn rightop = deleteHelper(root2.right, x);
			root.right = rightop.root;
			rightop.root=root;
			return rightop;
		}
		
		if(root.data <x) {
			BSTDeleteReturn leftop = deleteHelper(root2.left, x);
			root.left = leftop.root;
			leftop.root=root;
			return leftop;
		}
		
		if(root2.left==null && root2.right ==null) {
			return new BSTDeleteReturn(null, true);
		}
		
		if(root2.left !=null && root2.right ==null) {
			return new BSTDeleteReturn(root.left, true);
		}
		
		if(root2.left==null && root2.right !=null) {
			return new BSTDeleteReturn(root.right, true);
		}
		
		int rightMax = max(root.right);
		root.data = rightMax;
		BSTDeleteReturn opright = deleteHelper(root2.right, rightMax);
		root.right = opright.root;
		return new BSTDeleteReturn(root, true);
		
		
	}

	public int size() {
		return size;
	}
	
	public void printTree() {
		printHelper(root);
	}

	private static void printHelper(TreeNode<Integer> root2) {
		
		if(root2==null)return;
		
		System.out.print(root2.data+":");
		if(root2.left != null) {
			System.out.print("L"+root2.left.data+", ");
		}
		if(root2.right != null) {
			System.out.print("R"+root2.right.data);
		}  
		System.out.println();
		
		printHelper(root2.left);
		printHelper(root2.right);
		
	}
	
}
