class Stack1{
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
		
	}
	static Node top;
	public static void push(int data){
		Node new_node=new Node(data);
		if(top==null){
			top=new_node;
		}
		else{
			new_node.next=top;
			top=new_node;
			}
		
	}
	public static void pop(){
		if(top==null){
			System.out.println("under flow");
		}
		else{
			top=top.next;

		}
	}
	public static void print(){
		Node temp=top;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public static void main(String args[]){
		push(10);
		push(20);
		push(30);
		push(40);
		push(50);
		print();
		pop();
		pop();
		pop();
		print();
	}
	
}