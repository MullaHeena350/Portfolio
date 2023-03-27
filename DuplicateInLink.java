class DuplicateInLink
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
	static int count=0;
	public static void insert(DuplicateInLink list,int data)
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
		count++;
	}
	public static void printList(Node head)
	{
		while(head!=null)
		{
			System.out.print(head.data+"->");
			head=head.next;
		}
	}
// -------------------------REMOVE CONSECUTIVE DUPLICATES------------------------------------
	public static void remove(DuplicateInLink list)
	{
		if(list.head.next==null)
		{
			System.out.println("no dulicates");
		}
		else
		{
			Node temp=list.head.next;
			Node cur=list.head;
			
			while(temp!=null)
			{	
				if(cur.data==temp.data)
				{
					temp=temp.next;
				}
				else{
					cur.next=temp;
				cur=temp;
				temp=temp.next;
				}
			}
			cur.next=temp;
		}
	}
// -----------------------------------------------------------------------------------
	public static void duplicate(DuplicateInLink list)
	{
		Node curr=list.head;
		// while (curr != null) {
  //            Node temp = curr;
  //           while(temp!=null && temp.data==curr.data) {
  //               temp = temp.next;
  //           }
  //           curr.next = temp;
  //           curr = curr.next;
  //       }
		while(curr!=null)
		{
			Node temp=curr.next;
			while(temp!=null)
			{
				if(temp.data==curr.data)
				{
					temp=temp.next;
				}
				curr.next=temp;
				break;
			}
			curr=curr.next;
		}
	}
	public static boolean search(DuplicateInLink list,int x)
	{
		Node temp=list.head;
		if(temp==null)
		{
			return false;
		}
		while(temp!=null)
		{
			if(temp.data==x)
			{
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
	public static boolean searchRecursive(Node head,int x)
	{
		if(head==null)
		{
			return false;
		}
		if(head.data==x)
			{
				return true;
			}
		return searchRecursive(head.next,x);
	}
	public static int nTH(Node head,int index)
	{
		if(head==null)
		{
			return -1;
		}
		if(index==0)
		{
			return head.data;
		}
		return nTH(head.next,index-1);
	}
	public static void middle(Node head)
	{
		if(head==null)
		{
			return;
		}
		int mid=count/2;
		while(head!=null)
		{
			if(mid==0)
			{
				System.out.println("the middle node is"+head.data);
				return;
			}
			mid--;
			head=head.next;
		}
	}
	// --------Another approch to print middle elemnet-----------------------------------
	public static void printMiddle(Node head)
	{
		Node slow=head;
		Node fast=head;
		while(fast!=null&& fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		System.out.println("The middle elemnt found by another approch is"+slow.data);
	}
	// -----------------------------------------------------------------------------------
	// -----------------Length of list using recursive---------------------------------
	public static int length(Node head)
	{
		if(head.next==null)
		{
			return 1;
		}
		return length(head.next)+1;
	}
	// --------------------------------------------------------------------------------
	public static void main(String[] args) {
		DuplicateInLink list=new DuplicateInLink();
		list.insert(list,10);
		list.insert(list,9);
		list.insert(list,9);
		list.insert(list,9);
		list.insert(list,11);
		list.insert(list,11);
		list.insert(list,12);
		list.insert(list,12);
		list.insert(list,13);
		list.insert(list,13);
		if(list.search(list,15))
		{
			System.out.println("TRUE");
		}
		else
		{
			System.out.println("FALSE");
		}
		if(list.searchRecursive(list.head,13))
		{
			System.out.println("TRUE");
		}
		else
		{
			System.out.println("FALSE");
		}
		int x=list.nTH(list.head,3);
		System.out.println("found element at index:"+3+"is"+x);
		list.middle(list.head);
		list.printMiddle(list.head);
		System.out.println("before removing duplicates");
		list.printList(list.head);
		System.out.println("after removing duplicates");
		// list.remove(list);
		list.duplicate(list);
		list.printList(list.head);
		System.out.println();
	 System.out.println("The length of list is:"+list.length(list.head));

	}
}