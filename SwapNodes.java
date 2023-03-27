class SwapNodes
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
	public static void swap(SwapNodes list,int x,int y)
	{
		if(x==y)
		{
			return;
		}
		Node prevX=null,currX=list.head;
		while(currX!=null && currX.data!=x)
		{
			prevX=currX;
			currX=currX.next;
		}
		Node prevY=null,currY=list.head;
		while(currY!=null && currY.data!=y)
		{
			prevY=currY;
			currY=currY.next;
		}
		if(currX==null || currY==null)
		{
			return;
		}
		if(prevX!=null)
		{
			prevX.next=currY;
		}
		else
		{
			list.head=currY;
		}
		if(prevY!=null)
		{
			prevY.next=currX;
		}
		else
		{
			list.head=currX;
		}
		// swap pointers
		Node temp=currX.next;
		currX.next=currY.next;
		currY.next=temp;
	}
	public static void print_list(SwapNodes list)
	{
		Node current=list.head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
	} 
	public static void main(String[] args) {
		SwapNodes list=new SwapNodes();
		list.head=new Node(11);
		list.head.next=new Node(10);
		list.head.next.next=new Node(12);
		list.head.next.next.next=new Node(20);
		list.head.next.next.next.next=new Node(13);
		int x=20,y=10;
		list.swap(list,x,y);
		list.print_list(list);
	}
}