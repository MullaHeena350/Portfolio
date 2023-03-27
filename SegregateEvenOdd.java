class SegregateEvenOdd
{
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	} 
	Node head;
	public static void insert(SegregateEvenOdd list,int data)
	{
		Node new_node=new Node(data);
		if(list.head==null)
		{
			list.head=new_node;
		}
		else
		{
			Node last=list.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=new_node;
		}
	}
	public static void print_list(SegregateEvenOdd list)
	{
		Node current=list.head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
	}
	public static void segregate(SegregateEvenOdd list)
	{
		Node end,prev,cur;
		end=list.head;
		prev=null;
		while(end.next!=null)
		{
			end=end.next;
		}
		Node new_end=end;
		cur=list.head;
		// if from head of the list starts by odd elemnets
		while(cur.data%2!=0&&cur!=end)
		{
			new_end.next=cur;
			cur=cur.next;
			new_end.next.next=null;
			new_end=new_end.next;
			
		}
		if(cur.data%2==0)
		{
			list.head=cur;
			while(cur!=end)
			{
				if(cur.data%2==0)
				{
					prev=cur;
					cur=cur.next;
				}
				else
				{
					prev.next=cur.next;
				cur.next=null;
				new_end.next=cur;
				new_end=cur;
				cur=prev.next;
				}
			}
		}
		// else 
		// 	{prev = cur;}
 
 //        if (new_end != end && end.data %2 != 0)
 //        {
 //            prev.next = end.next;
 //            end.next = null;
 //            new_end.next = end;
 //        }
		// Node end = list.head;
  //       Node prev = null;
  //       Node curr = list.head;
 
  //       /* Get pointer to last Node */
  //       while (end.next != null)
  //           end = end.next;
 
  //       Node new_end = end;
 
  //       // Consider all odd nodes before getting first even node
  //       while (curr.data %2 !=0 && curr != end)
  //       {
  //           new_end.next = curr;
  //           curr = curr.next;
  //           new_end.next.next = null;
  //           new_end = new_end.next;
  //       }
 
  //       // do following steps only if there is an even node
  //       if (curr.data %2 ==0)
  //       {
  //           list.head = curr;
 
  //           // now curr points to first even node
  //           while (curr != end)
  //           {
  //               if (curr.data % 2 == 0)
  //               {
  //                   prev = curr;
  //                   curr = curr.next;
  //               }
  //               else
  //               {
  //                   /* Break the link between prev and curr*/
  //                   prev.next = curr.next;
 
  //                   /* Make next of curr as null */
  //                   curr.next = null;
 
  //                   /*Move curr to end */
  //                   new_end.next = curr;
 
  //                   /*Make curr as new end of list */
  //                   new_end = curr;
 
  //                   /*Update curr pointer */
  //                   curr = prev.next;
  //               }
  //           }
  //       }
 
  //       /* We have to set prev before executing rest of this code */
  //       else prev = curr;
 
  //       if (new_end != end && end.data %2 != 0)
  //       {
  //           prev.next = end.next;
  //           end.next = null;
  //           new_end.next = end;
  //       }
	}
	public static void main(String[] args) {
		SegregateEvenOdd list=new SegregateEvenOdd();
		list.head=new Node(15);
		list.head.next=new Node(13);
		list.head.next.next=new Node(17);
		list.head.next.next.next=new Node(10);
		list.head.next.next.next.next=new Node(6);
		list.head.next.next.next.next.next=new Node(5);
		list.head.next.next.next.next.next.next=new Node(8);
		print_list(list);
		segregate(list);
		print_list(list);


	}
}