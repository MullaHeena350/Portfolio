import java.util.*;
class LoopExists
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
	public static void insert(LoopExists list,int data)
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
	public static void loop(LoopExists list)
	{
		Node temp=list.head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=list.head;
	}
	//public static boolean detect(LoopExists list)
	//{
			// -------------------------this is just to detect loop----------------------------
		// Node slow=list.head;
		// Node fast=list.head;
		// while(slow!=null && fast!=null && fast.next!=null)
		// {
		// 	slow=slow.next;
		// 	fast=fast.next.next;
		// 	if(slow==fast)
		// 	{
		// 		return true;
		// 	}
		// }
		// return false;
		
	//}
	//------------------this is to find where is the loop starts-----------------------------
public static Node detect(LoopExists list)
{
	Node slow=list.head;
	Node fast=list.head;
	Node pre=slow;
	while(slow!=null && fast!=null&&fast.next!=null)
	{
		pre=slow;

		slow=slow.next;
		fast=fast.next.next;
				if(slow==fast)
		{
			break;
		}
	}
	if(slow!=fast)
	{
		return null; 
	}
	
	slow=list.head;
	while(slow!=fast)
	{
			 pre=slow;
		slow=slow.next;
		fast=fast.next;
	}
	return pre;
	// return slow;
}
public static boolean loop_hash(LoopExists list)
{
	Node temp=list.head;
	if(temp==null)
	{
		return false;
	}
	HashSet<Node>hash=new HashSet<Node>();
	while(temp!=null)
	{
		if(hash.contains(temp))
		{
			return true;
		}
		hash.add(temp);
		temp=temp.next;
	}
	return false;
}
	public static void main(String[] args) {
		LoopExists list=new LoopExists();
		list.insert(list,10);
		list.insert(list,20);
		list.insert(list,30);
		list.insert(list,45);
		list.insert(list,90);
		list.insert(list,49);
		list.loop(list);
		Node l=list.detect(list);
		if(l!=null)
		{
			System.out.println("yes"+l.data);
		}
		else
		{
			System.out.println("no");
		}
		if(list.loop_hash(list))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}