package stack;

public class Stack {

	private int arr[];
	private int s;
	
	public Stack() {
		arr=new int[10];
		s=-1;
	}
	public Stack(int n) {
		arr=new int[n];
		s=-1;
	}
	
	public int size() {
		return s+1;
	}
	public boolean isEmpty() {
		return s==-1;
	}
	
	public void push(int ele) {
		if(s==arr.length-1)
			doublecap();
		
		arr[++s]=ele;
	}
	
	public int top() {
		if(s==-1) {
			System.out.println("stack is empty");
			return -1;
		}
			
		return arr[s];
	}
	
	
	public int pop() {
		if(s==-1) {
			System.out.println("stack is empty");
			return -1;
		}
					
		return arr[s--];
	}
	
	private void doublecap() {

		int temp[]=arr;
		arr = new int[2*arr.length];
		for(int i=0; i<temp.length; i++) {
			arr[i]=temp[i];
		}
	}
	
}
