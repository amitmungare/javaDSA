package test5;

import java.util.HashMap;
import java.util.Map;

public class Replaceduplicatevalues {
	
	public static void replace(LinkedList<Integer> head) {
		
		Map<Integer, Integer> map = new HashMap<>();
		
		LinkedList<Integer> temp = head;
		
		int max=0;
		
		while(temp!=null) {
			int value;
			if(map.get(temp.data)==null) {
				value =0;
			}else {
				value=map.get(temp.data)+1;
			}
			
			map.put(temp.data, value);
			
			if(max<temp.data) {
				max=temp.data;
			}
			temp=temp.next;
		}
		
		while(head !=null) {
			if(map.get(head.data)>1)map.put(head.data, -1);
			else if(map.get(head.data)==-1)
				head.data = max++;
			
			head=head.next;
		}
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
