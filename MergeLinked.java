class MergeLinked
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
	Node a, b,c;
	public static void sort(MergeLinked list)
	{
		list.c=new Node(0);
		Node result=list.c;
		Node temp1=list.a,temp2=list.b;
		while(temp1!=null&&temp2!=null)
		{
			if(temp1.data<temp2.data)
			{
				result.next=new Node(temp1.data);
				temp1=temp1.next;
			}
			else
			{
				result.next=new Node(temp2.data);
				temp2=temp2.next;
			}
			result=result.next;
		}
		while(temp1!=null)
		{
			result.next=new Node(temp1.data);
			temp1=temp1.next;
			result=result.next;
		}
		while(temp2!=null)
		{
			result.next=new Node(temp2.data);
			temp2=temp2.next;
			result=result.next;
		}
		list.c=list.c.next;
	}
// -----------using recursion----------------------------------------------------
	public static Node sortRecursion(Node A, Node B)
	{
		if(A==null)
		{
			return B;
		}
		if(B==null)
		{
			return A;
		}
		if(A.data<B.data)
		{
			A.next=sortRecursion(A.next,B);
			return A;
		}
		else
		{
			B.next=sortRecursion(A,B.next);
			return B;
		}
		// return A;
	}
// ------------------------------------------------------------------------------
	public static void printList(Node c)
	{
		while(c!=null)
		{
			System.out.print(c.data+" ");
			c=c.next;
		}
	}
	public static void main(String[] args) {
		MergeLinked list=new MergeLinked();
		list.a=new Node(12);
		list.a.next=new Node(45);
		list.a.next.next=new Node(55);
		list.a.next.next.next=new Node(65);
		//-----------------------------------------
		list.b=new Node(1);
		list.b.next=new Node(5);
		list.b.next.next=new Node(7);
		list.b.next.next.next=new Node(8);
		list.b.next.next.next.next=new Node(10);
		list.b.next.next.next.next.next=new Node(65);
		// list.sort(list);
		list.c=list.sortRecursion(list.a,list.b);
		list.printList(list.c);
	}
}