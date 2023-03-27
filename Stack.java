class Stack
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
	Node top;
	public static Stack push(Stack list,int data)
	{
			
			Node new_node=new Node(data);
		Node temp=list.top;
		if(list.top==null)
		{
			list.top=new_node;
		}
		else
		{
			new_node.next=list.top;
			list.top=new_node;
		}
		return list;
	}
	public static void display(Stack list)
	{
		Node temp=list.top;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public static void pop(Stack list)
	{	
		// Node c=list.top;
		if(list.top==null)
		{
			System.out.println("under flow");
		}
		else
		{
			list.top=list.top.next;
		}
	}
	public static void main(String[] args) {
		Stack list=new Stack();
		list.push(list,10);
		list.push(list,11);
		list.push(list,12);
		list.push(list,13);
		list.display(list);
		list.pop(list);
		System.out.println();
		list.display(list);
		list.pop(list);
		System.out.println();
		list.display(list);
		list.pop(list);
		System.out.println();
		list.display(list);
		list.pop(list);
		System.out.println();
		list.display(list);
		list.pop(list);
		System.out.println();
		list.display(list);
	}
}