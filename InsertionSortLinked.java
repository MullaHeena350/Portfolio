public class InsertionSortLinked
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
	Node head,sorted;
	public static void push(InsertionSortLinked list, int data)
	{
		Node new_node=new Node(data);
		if(list.head==null)
		{
			new_node.next=list.head;
			list.head=new_node;
		}
	}
	public static void printList(InsertionSortLinked list)
	{
		Node temp=list.head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public static void insert(InsertionSortLinked list)
	{
		
	}
	public static void sort(Node newnode,InsertionSortLinked list)
	{
		
	}
	public static void main(String[] args) {
		InsertionSortLinked list=new InsertionSortLinked();
		list.push(list,90);
		list.push(list,20);
		list.push(list,30);
		list.push(list,45);
		list.push(list,10);
		System.out.println("----------------before----------");
		list.printList(list);
		list.insert(list);
		list.printList(list);
		System.out.println("---------------after----------");

		
	}
}