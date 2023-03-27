class Queue1{
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;	
		}
			
	}
	static Node rear,front;
	public static void enqueue(int data){
		Node new_node=new Node(data);
		if(rear==null && front==null){
			rear=new_node;
			front=new_node;
		}
		else{
			rear.next=new_node;
			rear=new_node;
		}

	}
	public static void dequeue(){
		if(front==rear){
			front=rear=null;
		}
		else if(front==null){
			System.out.println("queue is empty");
		}
		else{
			front=front.next;	
		}
	
		
		
	}
	public static void display(){
		Node temp=front;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}

	}
	public static void main(String args[]){
		enqueue(10);
		enqueue(20);
		enqueue(30);
		enqueue(40);
		enqueue(50);
		display();
		dequeue();
		dequeue();
		dequeue();
		display();
	}
}