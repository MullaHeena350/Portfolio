import java.util.*;
class BinarySearchTree
{
	static class Node
	{
		int data;
		Node left;
		Node right;
		Node(int d)
		{
			data=d;
		}
	}
	Node root=null;
	public static Node insert(Node root,int data)
	{
		if(root==null)
		{
			 root=new Node(data);
			return root;
		}
		else if(data<root.data)
		{
			root.left=insert(root.left,data);
		}
		else
		{
			root.right=insert(root.right,data);
		}
		return root;
	}
	public static void inorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);

	}
	public static boolean search(Node root,int key)
	{
		if(root==null)
		{
			return false;
		}
		if(key<root.data)
		{
			return search(root.left,key);
		}
		else if(key>root.data)
		{
			return search(root.right,key);
		}
		else if(key==root.data)
		{
			return true;
		}
		return true;
	}
	public static Node delete(Node root,int val)
	{//below until else if is to search the val -------
		if(val<root.data)
		{
			root.left=delete(root.left,val);
		}
		else if(val>root.data)
		{
			root.right=delete(root.right,val);
		}
		else
		{//val==root.data
			//case 1: which is leaf node
			if(root.right==null && root.left==null)
			{
				return null;
			}
			//case 2: where only one child is there ..that can be either right child or left child 
			 if(root.left==null)
			{
				return root.right;
			}
			else if(root.right==null)
			{
				return root.left;
			}
			//case 3:if two childs are there then do inorder succesor
			Node IS=inorderSuccessor(root.right);
			root.data=IS.data;
			root.right=delete(root.right,IS.data);//delete inorder subtree
		}
		return root;
	}
	public static Node inorderSuccessor(Node root)
	{
		while(root.left!=null)
		{
			root=root.left;
		}
		return root;
	}
	public static void printRange(Node root,int x,int y)
	{
		if(root==null)
		{
			return;
		}
		else if(root.data>=x && root.data<=y)
		{
			printRange(root.left,x,y);
			System.out.println(root.data+" ");
			printRange(root.right,x,y);
		}
		else if(y<=root.data)
		{
			printRange(root.left,x,y);
			
		}
		else if(x>=root.data)
		{
			printRange(root.right,x,y);
			
		}
	}
	public static void printRoot2Leaf(Node root,ArrayList<Integer>path)
	{
		if(root==null)
		{
			return;
		}
		path.add(root.data);
		if(root.left==null&&root.right==null)
		{
			System.out.println(path);
		}
		else
		{
			printRoot2Leaf(root.left,path);
			printRoot2Leaf(root.right,path);
		}
	}
	public static void main(String[] args) {
		BinarySearchTree list=new BinarySearchTree();
		int a[]=new int[] {5,12,3,11,7,2,1,4,9,6,24,23,25};
		// Node root=null;
		for(int i=0;i<a.length;i++)
		{
			list.root=insert(list.root,a[i]);
		}
		inorder(list.root);
		int key=26;
		if(search(list.root,key))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		list.root=delete(list.root,12);
		inorder(list.root);
		int x=1,y=12;
		printRange(list.root,x,y);
		ArrayList<Integer>path=new ArrayList<>();
		printRoot2Leaf(list.root,path);
	}
}