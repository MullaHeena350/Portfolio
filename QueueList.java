class QueueList
{
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	Node front,rear;
	public static QueueList enQueue(QueueList list,int data)
	{
		Node new_node=new Node(data);
		if(list.rear==null)
		{
			list.front=new_node;
			list.rear=new_node;
		}
		list.rear.next=new_node;
		list.rear=new_node;
		return list;

	}
	public static void deQueue(QueueList list)
	{
		if(list.front==null)
		{
			System.out.println("no");
			return;
		}
		list.front=list.front.next;
	}
	public static void printQueue(QueueList list)
	{
		Node temp=list.front;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		QueueList list=new QueueList();
		list.enQueue(list,10);
		list.enQueue(list,20);
		list.enQueue(list,30);
		list.printQueue(list);
		list.deQueue(list);
		list.printQueue(list);
		list.deQueue(list);
		list.printQueue(list);
		list.deQueue(list);
		list.printQueue(list);
		list.deQueue(list);
		list.printQueue(list);
	}
}