package test6;

import java.util.Scanner;

class Node<T>{
	T data;
	Node<T> next;
	
	public Node(T data) {
		this.data = data;
		this.next = null;
	}
	
}

public class MoveToLast {
	
	public static Node<Integer> fun(Node<Integer> head, int n){
		
		Node<Integer> prev=null;
		Node<Integer> last=null;
		Node<Integer> temp = head;
		int l=1;
		
		while(temp.next != null) {
			l++;
			temp=temp.next;
		}
		last=temp;
		temp=head;
		
		for(int i=0; i<l; i++) {
			if(temp.data==n) {
				if(prev==null) {
					Node<Integer> temp2 = new Node<Integer>(temp.data);
					head =head.next;
					last.next=temp2;
					prev=null;
					temp=head;
				}else {
					Node<Integer> temp2=new Node<Integer>(temp.data);
					prev.next = temp.next;
					last.next=temp2;
					temp=temp.next;
				}
				last=last.next;
			}else {
				prev=temp;
				temp=temp.next;
			}
		}
		return head;
	}
	
	public static Node<Integer> takeInput(){
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();		
		
		Node<Integer> head = null;
		Node<Integer> tail = null;
		
		while(data != -1) {
			Node<Integer> currnode = new Node<Integer>(data);
			
			if(head ==null) {
				head=currnode;
				tail=currnode;
			}else {
				tail.next = currnode;
				tail =currnode;
			}
			data = sc.nextInt();
		}
		return head;
		
	}

	public static void print(Node<Integer> head) {
		
		if(head==null)return;
		
		while(head.data ==0)head=head.next;
	
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Node<Integer> head=takeInput();
		int n=sc.nextInt();
		
		print(fun(head,n));

	}

}
