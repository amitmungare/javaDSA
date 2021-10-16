package hashMap;

import java.util.*;

public class Map<K,V> {
	
	ArrayList<MapNode<K,V>> buckets;
	int count;
	int numBuckets;
	
	public Map() {
		
		buckets = new ArrayList<>();
		numBuckets=5;
		for(int i=0; i<numBuckets; i++) {
			buckets.add(null);
		}
		
	}
	
	public void insert(K key, V value) {
		
		int index = getIndex(key);
		MapNode<K, V> head = buckets.get(index);
		
		while(head != null) {
			if(head.key.equals(key)) {
				head.value = value;
				return;
			}
			head=head.next;
		}
		
		head = buckets.get(index);
		MapNode<K, V> newNode = new MapNode<>(key,value);
		newNode.next=head;
		buckets.set(index, newNode);
		count++;
		double loadfactor = (1.0*count)/numBuckets;
		if(loadfactor > 0.7) {
			reHash();
		}
		
	}
	
	private int getIndex(K key) {
		int hc = key.hashCode();
		return hc%numBuckets;
	}
	
	public int size() {
		return count;
	}
	
	public V getValue(K key) {
		
		int index = getIndex(key);
		MapNode<K, V> head = buckets.get(index);
		
		while(head != null) {
			if(head.key.equals(key)) {
				return head.value;
			}
			head=head.next;
		}
		return null;
	}
	
	public V removeKey(K key) {
		
		int index = getIndex(key);
		MapNode<K, V> head = buckets.get(index);
		MapNode<K, V> prev = null;
		
		while(head != null) {
			if(head.key.equals(key)) {
				if(prev != null) {
					prev.next = head.next;
				}else {
					buckets.set(index, head.next);
				}
				count--;
				return head.value;
			}
			prev=head;
			head=head.next;
		}
		return null;
		
	}
	
	public double loadfactor() {
		return (1.0*count)/numBuckets;
	}
	
	private void reHash() {
		ArrayList<MapNode<K, V>> temp = buckets;
		buckets = new ArrayList<>();
		for(int i=0; i<2*numBuckets; i++) {
			buckets.add(null);
		}
		count=0;
		numBuckets = numBuckets*2;
		
		for(int i=0; i<temp.size(); i++) {
			MapNode<K, V> head = temp.get(i);
			while(head != null) {
				K key = head.key;
				V value = head.value;
				insert(key,value);
				head = head.next;
			}
		}
	}
	
	
	
	
	
	
	

}
