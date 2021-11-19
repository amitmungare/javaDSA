package stack;

public class StackLL<T> {
	
	private LinkedList<T> head;
	private int size;
	T nulls;
	public StackLL() {
		head=null;
		size=0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		if(head==null)return true;
		else
			return false;
	}
	
	public T top() {
		if(head==null)return nulls;
		return head.data;
	}
	
	public void push(T ele) {
		LinkedList<T> newnode = new LinkedList<T>(ele);
		newnode.next=head;
		head = newnode;
		size++;
	}
	
	public T pop() {
		if(head==null)return nulls;
		
		T temp = head.data;
		head=head.next;
		size--;
		return temp;
	}

}
