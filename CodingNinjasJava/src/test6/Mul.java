package test6;

import java.util.*;

public class Mul {

 
    public static void multiplyTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second)
    {    	
        long mod = 1000000007;
        long num1 = 0, num2 = 0;
 
        while (first != null || second !=  null){
             
            if(first != null){
                num1 = ((num1)*10)%mod + first.data;
                first = first.next;
            }
             
            if(second != null)
            {
                num2 = ((num2)*10)%mod + second.data;
                second = second.next;
            }
             
        }
        long num = (num1%mod)*(num2%mod)%mod;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        while(num !=0) {
        	list.add((int)num%10);
        	num/=10;
        }
        
        for(int i=list.size()-1; i>=0; i--) {
        	System.out.print(list.get(i)+" ");
        }
        
    }
 
    
    public static void main(String args[])
    {
    	LinkedListNode<Integer> first = takeInput();
    	LinkedListNode<Integer> second = takeInput();
        
        multiplyTwoLists(first, second);
    }
    
    
    public static LinkedListNode<Integer> takeInput(){
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();		
		
		LinkedListNode<Integer> head = null;
		LinkedListNode<Integer> tail = null;
		
		while(data != -1) {
			LinkedListNode<Integer> currnode = new LinkedListNode<Integer>(data);
			
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
    
    
    

}
