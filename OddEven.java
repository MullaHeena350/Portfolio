class OddEven{
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
			Node current=head;
			while(current.next!=null){
				current=current.next;
				
			}
			current.next=new_node;
		}
	} 
	public static void print(){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public static void odd_Even(){
		Node odd=head,even=head.next,evenFirst=even;
		while(1==1){
			if(odd==null || even==null || even.next==null){
				odd.next=evenFirst;
				return;
			}
			odd.next=even.next;
			odd=even.next;
			if(odd.next==null){
				even.next=null;
				odd.next=evenFirst;
				return;
			}
			even.next=odd.next;
			even=odd.next;

		}
	}
	public static void main(String args[]){
		insert(10);
		insert(20);
		insert(30);
		insert(40);
		insert(50);
		insert(60);
		print();
		odd_Even();
		print();
	}
}