class Occur_Linked
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
	public static void insert(Occur_Linked list,int data)
	{
		Node node=new Node(data);
		if(list.head==null)
		{
			list.head=node;
		}
		else
		{
			Node temp=list.head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=node;
		}
	}
	public static void printList(Node head)
	{
		while(head!=null)
		{
			System.out.print(head.data+"->");
			head=head.next;
		}
	}
	public static int occur(Node head,int key)
	{
		if(head.next==null)
		{
			if(head.data==key)
			{
				return 1;
			}
			return 0;
		}
		int j=occur(head.next,key);
		if(head.data==key)
		{
			 j++;
		}
		return j;
	}
	// ---------------------from geeksforgeeks--------------------------------------
	int count(Node head, int key)
	{
		    if (head == null)
		        return 0;
		    if (head.data == key)
		        return 1 + count(head.next, key);
		    return count(head.next, key);
	}
	// -----------------------------------------------------------------------
	public static void dupliUnSort(Occur_Linked list)
	{
		Node ptr1=list.head,ptr2=null;
		while(ptr1!=null)
		{
			ptr2=ptr1;
			while(ptr2.next!=null)
			{
				if(ptr1.data==ptr2.next.data)
				{
					ptr2.next=ptr2.next.next;
				}
				else
				{
					ptr2=ptr2.next;
				}
			}
			ptr1=ptr1.next;
		}
	}
	public static void main(String[] args) {
		Occur_Linked list= new Occur_Linked();
		list.insert(list,11);
		list.insert(list,12);
		list.insert(list,13);
		list.insert(list,12);
		list.insert(list,14);
		list.insert(list,10);
		list.insert(list,14);
		list.insert(list,15);
		list.insert(list,11);
		list.insert(list,11);
		list.insert(list,12);
		list.printList(list.head);
		System.out.println();
		int n=list.occur(list.head,11);
		System.out.println("the number of occurances is "+n);
		list.dupliUnSort(list);
		list.printList(list.head);
	}
}