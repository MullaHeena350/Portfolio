class IntersectSorted
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
	static Node a=null,b=null,c=null;
	// public static Node intersect(Node a, Node b)
	// {
	// 	Node result=new Node(0);
	// 	Node temp=result;
	// 	while(a!=null && b!=null)
	// 	{
	// 		System.out.println(a.data+","+b.data);
	// 		if(a.data==b.data)
	// 		{
	// 			temp.next=new Node(a.data);
	// 			// System.out.println(temp.next.data);
			
	// 			temp=temp.next;
	// 				a=a.next;
	// 			b=b.next;
	// 		}
	// 		else if(a.data<b.data)
	// 		{
	// 			a=a.next;
	// 		}
	// 		else
	// 		{
	// 			b=b.next;
	// 		}
	// 	}
	// 	result=result.next;
	// 	return result;
	// }
	// public static void print_list(Node current)
	// {
		
	// 	while(current!=null)
	// 	{
	// 		System.out.print(current.data+" ");
	// 		current=current.next;
	// 	}
	// }
	public static boolean intersect(Node a, Node b)
	{
		Node temp;
		while(a!=null)
		{
			 temp=b;
			while(temp!=null)
			{
				if(temp==a)
				{
					return true;
				}
				temp=temp.next;
			}
			a=a.next;
		}
		return false;
	}
	public static void main(String[] args) {
		IntersectSorted list=new IntersectSorted();
			// Node node=new Node(23);
			// list.a=node;
			// 	 node=new Node(1);
			// list.b=node;
			// 	 node=new Node(24);
			// list.a.next=node;
			// 	 node=new Node(2);
			// list.b.next=node;
			// 	 node=new Node(25);
			// list.a.next.next=node;
			// 	 node=new Node(3);
			// list.b.next.next=node;
			// 	 node=new Node(4);
			// list.a.next.next.next=node;
 		// list.b.next.next.next=node;
 		// node=new Node(8);
 		// list.a.next.next.next.next=node;
 		list.a = new Node(1);
        list.a.next = new Node(4);
        list.a.next.next = new Node(6);
        list.a.next.next.next = new Node(7);
        list.a.next.next.next.next = new Node(8);
        list.a.next.next.next.next.next = new Node(10);
 
        // creating second linked list
        list.b = new Node(2);
        list.b.next = new Node(4);
        list.b.next.next = list.a.next.next;
        
		if(intersect(list.a,list.b))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		// print_list(list.c);
	}
}