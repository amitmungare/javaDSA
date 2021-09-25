package test5;

public class Sort {
	
public static LinkedList<Integer> mergeSort(LinkedList<Integer> head) {
		
        if(head == null || head.next == null)return head;
        
        LinkedList<Integer> mid =midPoint(head);
        
        LinkedList<Integer> p1head = head;
        LinkedList<Integer> p2head = mid.next;
        mid.next =null;
        
        
        p1head = mergeSort(p1head);
        p2head = mergeSort(p2head);
        
        return merge(p1head,p2head);
        
	}
    
    
    public static LinkedList<Integer> midPoint(LinkedList<Integer> head) {
        
    	LinkedList<Integer> slow =head;
    	LinkedList<Integer> fast =head;
        if(head==null)return head;
        
        while(fast.next != null ){           
            fast = fast.next.next;
            if(fast==null)break;
            slow = slow.next;
        }
        return slow;
    }
    
     public static LinkedList<Integer> merge(LinkedList<Integer> head1, LinkedList<Integer> head2) {
        
    	 LinkedList<Integer> op =null;
    	 LinkedList<Integer> ophead =null;
        
        if(head1 ==null)return head2;
        if(head2 ==null)return head1;
        
         if(head1.data <= head2.data){
                ophead = head1;
                op=head1;
                head1 = head1.next;
            }else{
                ophead = head2;
                op=head2;
                head2 = head2.next;
            }
        
        while(head1 !=null && head2 != null){
            
            if(head1.data <= head2.data){
                op.next=head1;               
                head1 = head1.next;
            }else{
                op.next=head2;
                head2 = head2.next;
            }
            op = op.next;
        }
        
        if(head1 !=null){
            op.next=head1;
        }else{
            op.next=head2;
        }
        
        return ophead;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
