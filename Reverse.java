class Reverse{
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	static Node head;
	public static void insert(int data){
		Node new_node=new Node(data);
		if(head==null){
			head=new_node;
		}
		else{
			Node last=head;
			while(last.next!=null){
				last=last.next;
			}
			last.next=new_node;
		}
	}
	public static void print(){
		Node temp=head;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

	public static void Reverse_ll(){
		Node current=head,prev=null,secondary;
		while(current!=null){
			secondary=current.next;
			current.next=prev;
			prev=current;
			current=secondary;
		}
		head=prev;

	}
	public static void main(String args[]){
		insert(10);
		insert(20);
		insert(30);
		insert(40);
		insert(50);
		print();
		Reverse_ll();
		print();
	}
}