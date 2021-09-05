package linkedList;

import java.util.*;

import linkedList.LinkedList;

public class LInkedListUse {
	
	public static LinkedList<Integer> creatLL(){
		
		LinkedList<Integer> head = new LinkedList<Integer>(10);
		LinkedList<Integer> n1 = new LinkedList<Integer>(20);
		head.next= n1;
		LinkedList<Integer> n2 = new LinkedList<Integer>(30);
		n1.next= n2;
		LinkedList<Integer> n3 = new LinkedList<Integer>(40);
		n2.next= n3;
		LinkedList<Integer> n4 = new LinkedList<Integer>(50);
		n3.next= n4;
		LinkedList<Integer> n5 = new LinkedList<Integer>(60);
		n4.next= n5;
		
		return head;
	}
	
	public static LinkedList<Integer> takeInput(){
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();		
		
		LinkedList<Integer> head = null;
		LinkedList<Integer> tail = null;
		
		while(data != -1) {
			LinkedList<Integer> currnode = new LinkedList<Integer>(data);
			
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
	
	public static void print1LL(LinkedList<Integer> head) {
		
		while(head !=null) {
			System.out.print(head.data+ " ");
			head=head.next;
		}
		
	}

	public static void main(String[] args) {
		
//		LinkedList<Integer> head = creatLL();
		
		LinkedList<Integer> head =takeInput();
		
		print1LL(head);
	}

}
