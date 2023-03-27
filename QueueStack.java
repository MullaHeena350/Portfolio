import java.util.Stack;
class QueueStack
{
	static Stack<Integer> s1 =new Stack<Integer>();
	static Stack<Integer> s2=new Stack<Integer>(); 
	static void enQueue(int data)
	{
		while(!s1.isEmpty())
		{
			s2.push(s1.pop());
		}
		s1.push(data);
		while(!s2.isEmpty())
		{
			s1.push(s2.pop());
		}
	}
	static int deQueue()
	{
		if(s1.isEmpty())
		{
			System.out.println("Queue is Empty");
			System.exit(0);
		}
		return s1.pop();
	}
	public static void main(String[] args) {
		// System.out.print("jkilk");
		QueueStack q=new QueueStack();
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.enQueue(4);
		q.enQueue(5);
		
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());

		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		


	}
}