import java.util.*;
class LinkedList
{	static int count=0;
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
	public static LinkedList insert(LinkedList list,int data)
	{
		Node new_node=new Node(data);
		if(list.head==null)
		{
			list.head=new_node;
			count++;
		}
		else
		{
			Node last=list.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=new_node;
			count++;
		}
		return list;
	}
	public static void print_list(LinkedList list)
	{
		Node current=list.head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
		System.out.println();
	} 
	public static LinkedList delete(LinkedList list, int key)
	{
		Node current=list.head,prev=null;
		if(current!=null && current.data==key)
		{
			list.head=current.next;
			System.out.println("found and deleted");
			return list;
		}
		while(current!=null && current.data!=key)
		{
			prev=current;
			current=current.next;
		}
		if(current!=null)
		{
			prev.next=current.next;
			System.out.println("found and deleted");
		}
		if(current==null)
		{
			System.out.println("not found");
		}
		return list;

	}
	public static LinkedList deletAtPosition(LinkedList list, int index)
	{
		Node current=list.head,prev=null;
		if(index==0 && current!=null)
		{
			list.head=current.next;
			return list;
		}
		int count=0;
		while(current!=null)
		{
			if(count==index)
			{
				prev.next=current.next;
				System.out.println("deleted At Postion of "+index);
				break;
			}
			else
			{
				prev=current;
				current=current.next;
				count++;

			}
		}
		if(current==null)
		{
			System.out.println("No position found");
		}
		return list;
	}
	public static void reverseList(LinkedList list)
	{
		Node current=list.head,prev=null,second=null;
		while(current!=null)
		{
			second=current.next;
			current.next=prev;
			prev=current;
			current=second;
		}
		list.head=prev;
	}
	// ------------------------DELETE Kth Node FROM ENDING------------------------------------------
	public static void deleteKNode(LinkedList list,int k){
	// {
		// if(list.head==null)
		// {
		// 	return;
		// }
		// else
		// {	Node temp=list.head,second=list.head.next;
		// 	int n=count-k;
		// 	int i=0;
		// 	// temp=list.head;
		// 	// second=second.next;
		// 	if(k==1)
		// 	{
		// 	while(i<n&&second.next!=null)
		// 	{
		// 		temp=temp.next;
		// 		second=second.next;
		// 	}
		// 	temp.next=second.next;
		// 	}
		// 	else
		// 	{	
		// 	while(i<n-1)
		// 	{
		// 		temp=temp.next;
		// 		// second=second.next;
		// 	}
		// 	temp.next=temp.next.next;	
		// 	}
		// }
	// 	}
	Node first = list.head;
        Node second = list.head;
        for (int i = 0; i < k; i++)
         {
            if (second.next == null) 
            {
                if (i == k - 1)
                    list.head = list.head.next;
                return;
            }
            second = second.next;
        }
        while (second.next != null) {
            first = first.next;
            second = second.next;
        }
        first.next = first.next.next;
	}
	// ----------------------Anothe approch to find Nth node-----------------------------
	public static void nThNode(Node head,int N)
	{
		int n=count-N;
		// if(n<count)
		// {
		// 	return;
		// }
		for(int i=0;i<n;i++)
		{
			head=head.next;
		}
		System.out.println("The NthNode from last found by another approech:"+head.data);
	}
	// ---------------------------------------------------------------------------------------
	public static int recursiveNthNode(Node head,int N)
	{
		if(head.next==null)
		{
			if(N==1)
			{
				System.out.println("Found the element by recusrion:"+head.data);
			}
			return N;
		}
		N=recursiveNthNode(head.next,N) -1;
		if(N==1)
		{
			System.out.println("Found the element by recusrion:"+head.data);
		}
		return N;
	}
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list=insert(list,2);
		list=insert(list,3);
		list=insert(list,1);
		list=insert(list,7);
		list=insert(list,9);
		print_list(list);
		// list.deleteKNode(list,5);
		list.nThNode(list.head,4);
		list.recursiveNthNode(list.head,0);



		// print_list(list);
		// list.delete(list,2);
		// list.deletAtPosition(list,9);
		// list.reverseList(list);
		print_list(list);

	}
}
// class LinkedList
// {
// 	public static void main(String[] args) {
// 		Map<Character,Integer>map=new HashMap<>();
// 		String s="anagram";
// 		char c[]=s.toCharArray();
// 		for(char k:c)
// 		{
// 			System.out.print(k+" ");
// 		}
// 		map.put('c',6);
// 		System.out.println(map.getOrDefault('c',0));
// 	}
// }