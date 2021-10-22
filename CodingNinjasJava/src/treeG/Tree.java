package treeG;
import java.util.*;

public class Tree<T> {

	T data;
	ArrayList<Tree<T>> child ;
	
	public Tree(T data) {
		this.data =data;
		this.child = new ArrayList<>();
	}
	
}
