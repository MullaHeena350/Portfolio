import java.util.Stack;
import java.util.*;
class List_Palindrome
{
	static class Node{
		char data;
		Node next;
		Node(char c)
		{
			data=c;
		}
	}
	static Node head;
	public static void insert(char data){
		Node new_node=new Node(data);
		if(head==null){
			head=new_node;
		}
		else{
			Node temp=head;
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=new_node;
		}


	}
	public static boolean ispalin(){
		Stack<Character> s=new Stack<Character>();
		Node temp=head;
		while(temp!=null){
			s.push(temp.data);
			temp=temp.next;
		}
		temp=head;
		while(temp!=null){
			if(temp.data==s.pop()){
				temp=temp.next;
			}
			else{
				return false;
			}
		}
		return true;

	}
	public static void main(String args[]){
		insert('R');
		insert('A');
		insert('T');
		insert('A');
		insert('R');
		if(ispalin()){
			System.out.println("palindrome");
		}
		else{
			System.out.println("not a palindrome");
		}
	}
}