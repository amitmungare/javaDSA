package treeG;

import java.util.*;
import binaryTree.TreeNode;
import queue.Queue;
import queue.QueueLL;

public class TreeUseG {
	
	public static Tree<Integer> takeInput(){
		Scanner sc =new Scanner(System.in);
		QueueLL<Tree<Integer>> pq = new QueueLL<>();
		
		System.out.println("Enter root data");
		int rootData = sc.nextInt();
		if(rootData==-1)return null;
		
		Tree<Integer> root = new Tree<Integer>(rootData);
		pq.enqueue(root);
		
		while(!pq.isEmpty()) {
			Tree<Integer> front = pq.dequeue();
			System.out.println("no of childs of "+front.data);
			int numchild = sc.nextInt();
			
			for(int i=0; i<numchild; i++) {
				System.out.println("Enter "+i+" node of "+front.data);
				int childData = sc.nextInt();
				Tree<Integer> child = new Tree<Integer>(childData);
				front.child.add(child);
				pq.enqueue(child);
			}
			
 		} 
		return root;
	}
	
	public static void printTreeG(Tree<Integer> root) {
		if(root==null)return;
		
		System.out.print(root.data+" ");
		
		for(int i=0; i<root.child.size();i++) {
			printTreeG(root.child.get(i));
		}
		
	}
	
	public static void printTreeOrderG(Tree<Integer> root) {
		if(root==null)return;
		
		System.out.print(root.data+": ");
		for(int i=0; i<root.child.size();i++) {
			System.out.print(root.child.get(i).data +" ");
		}
		System.out.println();
		for(int i=0; i<root.child.size();i++) {
			printTreeOrderG(root.child.get(i));
		}
		
	}
	
	

	public static void main(String[] args) {
		
//		Tree<Integer> root = new Tree<Integer>(1);
//		Tree<Integer> node1 = new Tree<Integer>(2);
//		Tree<Integer> node2 = new Tree<Integer>(3);
//		Tree<Integer> node3 = new Tree<Integer>(4);
//		Tree<Integer> node4 = new Tree<Integer>(5);
//		Tree<Integer> node5 = new Tree<Integer>(6);
//		Tree<Integer> node6 = new Tree<Integer>(7);
//		Tree<Integer> node7 = new Tree<Integer>(8);
//		
//		root.child.add(node1);
//		root.child.add(node2);
//		root.child.add(node3);
//		root.child.add(node4);
//		node2.child.add(node7);
//		node3.child.add(node5);
//		node3.child.add(node6);
//		
//		printTreeG(root);
//		printTreeOrderG(root);
		
		Tree<Integer> root = takeInput();
		printTreeOrderG(root);
		
	}
	
}
