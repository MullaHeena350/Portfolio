import java.util.Stack;
class QS{
	
	Stack <Integer> s1=new Stack<Integer>();
	Stack <Integer> s2=new Stack<Integer>();
	public static void enqueue(int data){
		while(!s1.isEmpty()){
				s2.push(s1.pop());
		}
		s1.push(data);
		while(!s2.isEmpty()){
			s1.push(s2.pop());
			
		}
	}
	public static void dequeue(){
		if(s1.isEmpty()){
			System.out.println("empty");
			System.exit(0);

		}
	
		return s1.pop();
	}
	
	public static void main(String args[]){
		QueueStack q=new QueueStack();

		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		System.out.println(q.dequeue());
		q.enqueue(50);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		
	}
}