package queue;

public class Queue {

	int arr[];
	int front;
	int rear;
	int size;
	
	public Queue() {
		arr=new int[10];
		front=-1;
		rear=-1;
		size=0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public int front() {
		if(size==0)return -1;
		return arr[front];
	}
	
	public void enqueue(int ele) {
		if(size==arr.length) {
			doublecap();
		}
		
		if(size==0)front =0;
		
//		rear++;
//		if(rear==arr.length) {
//			rear=0;
//		}
		rear = (rear+1)%arr.length;
		
		arr[rear]=ele;
		size++;
	}
	
	public int dequeue() {
		if(size==0)return -1;
		
		int temp=arr[front];
		
//		front++;		
//		if(front==arr.length) {
//			front=0;
//		}
		front = (front+1)%arr.length;

		size--;
		if(size==0) {
			front=-1;
			rear=-1;
		}
		
		return temp;
	}
	
	private void doublecap() {

		int temp[]=arr;
		arr = new int[2*temp.length];
		int ind=0;
		
		for(int i=front; i<temp.length; i++) {
			arr[ind++]=temp[i];
		}
		
		for(int i=0; i<front-1; i++) {
			arr[ind++]=temp[i];
		}
		front=0;
		rear=temp.length-1;
		
	}
	
}
