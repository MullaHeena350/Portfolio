class BinarySearch
{
	public static int search(int a[],int l,int r, int key)
	{
		if(l<=r)
		{
			int mid=(l+r)/2;
			if(a[mid]==key)
			{
				// System.out.print(mid);//
				return mid;
			}
			else if(a[mid]<key)
			{
				return search(a,mid+1,r,key);
			}
			else
			{
				return search(a,l,mid-1,key);
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int array[]={1,5,7,89,90,99,101,156};
		int key=156;
		int result=search(array,0,array.length-1,key);
		if(result==-1)
		{
			System.out.println("no element");
		}
		else
		{
			System.out.println("element found at "+result);
		}
	}
}