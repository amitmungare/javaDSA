package linkedList;

import java.util.Scanner;
import linkedList.LinkedList;



public class Eliminateduplicates {
	
	public static LinkedList<Integer> removeDuplicates(LinkedList<Integer> head) {
		
        LinkedList<Integer> temp = head;
        
        if(head==null)return head;
        
        while(temp.next != null && temp != null){
            
            if(temp.data == temp.next.data){
                temp.next = temp.next.next; 
            }else{
            	temp = temp.next;
            }
        	           
        }        
        
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

	public static void print1LL(LinkedList<Integer> head) {
		
		while(head !=null) {
			System.out.print(head.data+ " ");
			head=head.next;
		}
		
	}

	public static void main(String[] args) {
		
		LinkedList<Integer> head = takeInput();
		
		head = removeDuplicates(head);
		
		print1LL(head);
		
	}


}
