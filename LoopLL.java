import java.util.*;
class LoopLL
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
	static Node head;
	public static void insert(int data)
	{
		Node new_node=new Node(data);
		if(head==null)
		{
			head=new_node;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=new_node;
		}
	}
	// public static void loop(){
	// 	Node temp=head;
	// 	while(temp.next!=null){
	// 		temp=temp.next;
	// 	}
	// 	temp.next=head;
	// }
	public static boolean detect(){
		Node slow=head,fast=head;
		while(slow!=null && fast!=null && fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String args[]){
		insert(10);
		insert(20);
		insert(30);
		insert(40);
		insert(50);
		//loop();
		//head.next.next.next.next.next=head;
		if(detect()){
			System.out.print("exist");
		}
		else{
			System.out.print("not exist");
		}
	}
}