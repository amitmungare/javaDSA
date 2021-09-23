package queue;

import test5.LinkedList;

public class QueueLL<T> {

	private LinkedList<T> front;
	private LinkedList<T> rear;
	int size;
	T nulls = null;
	
	public QueueLL() {
		front=null;
		rear=null;
		size=0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return front==null;
	}
	public T front() {
		if(front==null)return nulls;
		return front.data;
	}
	public void enqueue(T ele) {
		
		LinkedList<T> newnode = new LinkedList<>(ele);
		
		if(rear==null || front ==null) {
			rear= newnode;
			front=newnode;
		}else {
			rear.next = newnode;
			rear = newnode;
		}		
		size++;		
	}
	public T dequeue() {
		
		if(front==null) return nulls;
		T temp = front.data;
		size--;
		front = front.next;
		if(front==null) rear= null;
		return temp;
	}
	
}
