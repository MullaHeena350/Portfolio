class InsertBegining
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
	public static Node  push(Node head,int data)
	{
		Node new_node=new Node(data);
		if(head==null)
		{
			head=new_node;
		}
		else
		{
			new_node.next=head;
			head=new_node;
		}
		return head;
	}
	public static void printList(Node head)
	{
		if(head==null)
		{
			return;
		}
		else
		{
			Node temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+"->");
				temp=temp.next;
			}
		}
	}
	public static void append(InsertBegining list,int data)
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
	public static void insertAfter(Node love,int data)
	{
		Node new_node=new Node(data);
			new_node.next=love.next;
			love.next=new_node;
	}
	public static void main(String[] args) {
		InsertBegining list=new InsertBegining();
		list.append(list,6);
		list.head=push(list.head,7);
		list.head=push(list.head,1);
		list.append(list,4);
		list.insertAfter(list.head.next,8);
		printList(list.head);

	}
}