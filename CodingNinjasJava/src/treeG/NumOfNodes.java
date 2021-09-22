package treeG;

public class NumOfNodes {
	
	public static int count(Tree<Integer> root) {
		
		int count=1;
		
		for(int i=0; i<root.child.size();i++) {
			count+=count(root.child.get(i));
		}
		return count;
	}

	public static void main(String[] args) {
		Tree<Integer> root = new Tree<Integer>(1);
		Tree<Integer> node1 = new Tree<Integer>(2);
		Tree<Integer> node2 = new Tree<Integer>(3);
		Tree<Integer> node3 = new Tree<Integer>(4);
		Tree<Integer> node4 = new Tree<Integer>(5);
		Tree<Integer> node5 = new Tree<Integer>(6);
		Tree<Integer> node6 = new Tree<Integer>(7);
		Tree<Integer> node7 = new Tree<Integer>(8);
		
		root.child.add(node1);
		root.child.add(node2);
		root.child.add(node3);
		root.child.add(node4);
		node2.child.add(node7);
		node3.child.add(node5);
		node3.child.add(node6);
		
		System.out.println(count(root));
	}

}
