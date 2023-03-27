import java.util.Stack;
import java.util.*;
class Linked_Palindrome
{
	static class Node
	{
		char data;
		Node next;
		Node(char c)
		{
			data=c;
		}
	}
	Node head;
	public static void insert(Linked_Palindrome list, char c)
	{
		Node new_node=new Node(c);
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
	public static boolean isPalin(Linked_Palindrome list)
	{
		// Deque <Character> s= new ArrayDeque <> ();
		Stack<Character> s = new Stack<Character>();

		Node temp=list.head;
		while(temp!=null)
		{
			s.push(temp.data);
			temp=temp.next;
		}
		temp=list.head;
		while(temp!=null)
		{	 
			if(temp.data==s.pop())
			{
				temp=temp.next;
			}
			else
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Linked_Palindrome list=new Linked_Palindrome();
		list.insert(list,'R');
		list.insert(list,'A');
		list.insert(list,'D');
		list.insert(list,'A');
		list.insert(list,'R');
		if(list.isPalin(list))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}

	}
}