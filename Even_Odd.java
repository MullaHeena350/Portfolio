class Even_Odd
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
	public static void insert(Even_Odd list,int data)
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
	public static void printList(Even_Odd list)
	{
		Node temp=list.head;
		while(temp!=null)
		{
			System.out.print(temp.data);
			temp=temp.next;
		}
	}
	public static void  evenOdd(Even_Odd list)
	{
		Node odd=list.head;
		Node oddFirst=list.head;
		Node even=list.head.next;
		Node evenFirst=even;
		list.head=evenFirst;
		if(even.next==null)
		{
			oddFirst.next=null;
			even.next=oddFirst;
			return;
		}
		while(1==1)
		{
			if(even.next==null)
			{	
				even.next=oddFirst;
				return ;
			}
			//connectine odd
			odd.next=even.next;
			odd=even.next;
			if(odd.next==null)
			{
				even.next=oddFirst;
				return ;
			}
			Node n=odd.next;
			even.next=n;
			even=n;
			odd.next=null;
		}
		
	}
	public static void main(String[] args) {
		Even_Odd list=new Even_Odd();
		list.insert(list,1);
		list.insert(list,2);
		list.insert(list,3);
		list.insert(list,4);
		list.insert(list,5);
		list.insert(list,6);
		list.insert(list,7);
		list.insert(list,8);
		list.insert(list,9);
		list.printList(list);
		System.out.println();
		list.evenOdd(list);
		list.printList(list);

		
	}
}