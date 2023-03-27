class LL{
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	static Node head,tail;
	public static void insert(int data){
		Node new_node=new Node(data);
		if(head==null){
			tail=new_node;
			head=new_node;
		}
		else 
		{
			//Node last=head;
			tail.next=new_node;
			tail=tail.next;
			// while(last.next!=null){
			// 	last=last.next;

			// }
			// last.next=new_node;
		}
	}
	public static void insertAtPosition(int pos){
		Node new_node=new Node(100);
		if(pos==0){
			new_node.next=head;
			head=new_node;
		}
		else{
			int i=0;
			Node temp=head,prev=null;
			while(i<pos){
				prev=temp;
				temp=temp.next;
				i++;

			}
			new_node.next=temp;
			prev.next=new_node;

		}
	}
	public static void insertAtnode(int key){
		Node current=head,prev=null;
		Node new_node=new Node(200);
		while(current!=null){
			if(current.data==key){
				break;
			}
			else{
				prev=current;
				current=current.next;
			}
		}
		if(current==null){
			System.out.println("key not found");
		}
		else{
			new_node.next=current;
			prev.next=new_node;
		}
	}
	
	public static void  Deletekthnode(int k){
		int a=length();
		int diff=a-k;
		Node current=head,prev=null;
		int i=0;
		while(i<diff){
			prev=current;
			current=current.next;
			i++;
		}
		if(current==null){
			System.out.println("key not found");
		}
		else{
			prev.next=current.next;
			current.next=null;
		}

	}
	public static int length(){
		Node temp=head;
		int count=0;
		while(temp!=null){
			count=count+1;
			temp=temp.next;
		}
		return count;
	}
	public static void printlist(){
		Node current=head;
		while(current!=null){
			System.out.println(current.data);
			current=current.next;
		}
	}
	public static void main(String args[]){
		insert(10);
		insert(20);
		insert(30);
		insert(40);
		insert(50);
		insertAtPosition(5);
		System.out.println("inserting node");
		insertAtnode(40);
		printlist();
		System.out.println("length of list " + length());
		Deletekthnode(5);
		System.out.println("after deleting");
		printlist();

	}
}