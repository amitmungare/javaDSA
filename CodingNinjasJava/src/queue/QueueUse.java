package queue;

public class QueueUse {

	public static void main(String[] args) {
		
//		Queue q = new Queue();
//		
//		q.enqueue(10);
//		q.enqueue(20);
//		q.enqueue(30);
//		q.enqueue(40);
//		System.out.println(q.dequeue());
//		System.out.println(q.size());
//		System.out.println(q.dequeue());
//		System.out.println(q.isEmpty());
//		System.out.println(q.dequeue());
//		System.out.println(q.dequeue());
//
//		q.enqueue(60);
//		q.enqueue(70);
//		System.out.println(q.front()+" front");
//		System.out.println(q.dequeue());
//		System.out.println(q.size());
//		System.out.println(q.isEmpty());
//
//		System.out.println(q.dequeue());
//		System.out.println(q.dequeue());
		
		
		QueueLL<Integer> q = new QueueLL<>();
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());

		
		
		
	}

}
