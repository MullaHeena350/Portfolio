class Odd_Even
{
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
		}
	}
	Node head;
	public static void insert(Odd_Even list,int data)
	{
			Node new_node=new Node(data);
		if(list.head==null)
		{
			list.head=new_node;
		}
		else
		{
			Node temp=list.head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=new_node;
		}
	}
	public static void printList(Odd_Even list)
	{
		Node temp=list.head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public static void oddEven(Odd_Even list)
	{
		Node odd=list.head;
		Node even=list.head.next;
		Node evenFirst=even;
		while(1==1)
		{
			if(odd==null||even==null|| even.next==null)
			{
			odd.next=evenFirst;
			return;
			}
			//connecting odd nodes
			odd.next=even.next;
			odd=even.next;
			if(odd.next==null)
			{
				even.next=null;
				odd.next=evenFirst;
				return;
			}
			//connecting even nodes
			even.next=odd.next;
			even=odd.next;
		}
		
	}
	public static void main(String[] args) {
		Odd_Even list=new Odd_Even();
		list.insert(list,1);
		list.insert(list,2);
		list.insert(list,3);
		list.insert(list,4);
		list.insert(list,5);
		list.printList(list);
		list.oddEven(list);
		System.out.println();
		list.printList(list);
	}
}