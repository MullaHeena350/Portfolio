class SearchRotated
{
	public static int search(int a[],int l,int r,int key)
	{
		if(l>r)
		{
			return -1;
		}
		int mid=(r+l)/2;
		if(a[mid]==key)
		{
			return mid;
		}
		if(a[l]<=a[mid])
		{
			if(key>=a[l]&&key<=a[mid])
				return search(a,l,mid-1,key);
			return search(a,mid+1,r,key);
		}
		if(key>=a[mid]&&key<=a[r])
			return search(a,mid+1,r,key);
		return search(a,l,mid-1,key);
	}	
		public static void main(String[] args) {
		int arr[] = { 4, 5, 6, 7, 8, 9, 1, 2, 3 };
		int key=3;
		int res=search(arr,0,arr.length-1,key);
		if(res==-1)
		{
			System.out.println("no");
		}
		else
		{
			System.out.println("yes found at "+res);
		}
	}
}