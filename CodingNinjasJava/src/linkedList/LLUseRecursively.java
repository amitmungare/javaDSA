package linkedList;

import java.util.Scanner;
import linkedList.LinkedList;

public class LLUseRecursively {
	
	public static void print(LinkedList head) {
		if(head==null)return;
		
		System.out.print(head.data+" ");
		print(head.next);
	}
	
	public static LinkedList<Integer> insert(LinkedList head, int data, int pos){

		if(pos==0) {			
			LinkedList<Integer> newNode = new LinkedList<Integer>(data);
			newNode.next=head;
			head = newNode;
			return head;
		}
		
		head.next = insert(head.next, data, pos-1);
		return head;
		
	}
	
	public static LinkedList<Integer> takeInput(){
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();		
		
		LinkedList<Integer> head = null;
		LinkedList<Integer> tail = null;
		
		while(data != -1) {
			LinkedList<Integer> currnode = new LinkedList<>(data);
			
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
	
	
	public static LinkedList<Integer> deleteNodeRec(LinkedList<Integer> head, int pos) {
    	
        if(pos == 0){
            head.next = head.next.next;
            return head;
        }
        
        head.next = deleteNodeRec(head.next, pos-1);
        return head;
        
	}
	

	public static void main(String[] args) {
		
		LinkedList<Integer> head = takeInput();
		
//		head = insert(head, 10, 2);
		
		head = deleteNodeRec(head, 2);
		
		print(head);

	}

}
