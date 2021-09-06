package test5;

public class NextNumber {
	
	public static LinkedList<Integer> addOne(LinkedList<Integer> head) 
    { 
		LinkedList<Integer> revhead = rev(head);
        add(revhead);
        return rev(revhead);
    }
    
    public static LinkedList<Integer> rev(LinkedList<Integer> head){
        
        if(head ==null || head.next ==null)return head;
        
        LinkedList<Integer> sa = rev(head.next);
        head.next.next = head;
        head.next = null;
        
        return sa;
        
    }
    
    public static LinkedList<Integer> add(LinkedList<Integer> head){
        
    	LinkedList<Integer> op = head;
    	LinkedList<Integer> temp = null;
        int carry=1;
        int sum;
        
        while(head !=null){
            
            sum = head.data+carry;
        
            if(sum > 9)carry =1;
            else carry =0;
            
            sum = sum%10;
            
            head.data = sum;
            
            temp = head;
            head = head.next;
            
        }
        
        if(carry>0)temp.next = new LinkedList<Integer>(carry);
        
        return head;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
