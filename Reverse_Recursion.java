class Reverse_Recursion
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
	public static void insert(Reverse_Recursion list,int data)
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
	public static Node reverseRecursion(Node head)
	{
		if(head.next==null || head==null)
		{
			return head;
		}
		Node rest=reverseRecursion(head.next);
		head.next.next=head;
		head.next=null;
		return rest; 
	}
	public static void printList(Reverse_Recursion list)
	{
		Node temp=list.head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	} 
	public static void main(String[] args)
	 {
		Reverse_Recursion list=new Reverse_Recursion();
		list.insert(list,12);
		list.insert(list,13);
		list.insert(list,14);
		list.insert(list,15);
		list.insert(list,16);
		list.printList(list);
		list.head=list.reverseRecursion(list.head);
		System.out.println("after reversing");
		list.printList(list);
	}
}