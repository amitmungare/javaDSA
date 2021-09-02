package linkedList;

import java.util.Scanner;

import linkedList.LinkedList;

public class AppendLastNToFirst {
	
public static LinkedList<Integer> appendLastNToFirst(LinkedList<Integer> head, int n) {
		
//        LinkedList<Integer> temp  = head;
//        
//        int i=0;
//        while(i<n-1){
//            temp =temp.next;
//            i++;
//        }
//        System.out.println(temp.data);
//        
//        LinkedList<Integer> newhead =temp.next;
//        temp.next=null;
//        LinkedList<Integer> temp2=newhead;
//        
//        while(temp2.next.data != -1){
//            temp2=temp2.next;
//        }
//        
//        temp2.next = head;
//        
//        return newhead;
	
	
	LinkedList<Integer> temp  = head;
    
    int i=0;
    while(i<n-2){
        temp =temp.next;
        i++;
    }
    
    LinkedList<Integer> newhead =temp.next;
    temp.next=null;
    LinkedList<Integer> temp2 =newhead;
    
    while(temp2.next != null) {
    	temp2=temp2.next;
    }
    
    temp2.next = head;
    
    return newhead;
        
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
	
	head = appendLastNToFirst(head, 4);
	
	print1LL(head);
	
}

}
