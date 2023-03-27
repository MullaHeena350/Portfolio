class HeapSort
{
	public static void sort(int a[])
	{
		int N=a.length;
		for(int i=(N/2)-1;i>=0;i--)
		{
			heapify(a,N,i);
		}
		for(int i=N-1;i>0;i--)
		{
			int swap=a[i];
			a[i]=a[0];
			a[0]=swap;
			heapify(a,i,0);
		}

	}
	public static void heapify(int a[],int N,int i)
	{
		int l=2*i+1;
		int r=2*i+2;
		int largest=i;
		if(l<N &&a[l]>a[largest])
		{
			largest=l;
		}
		if(r<N &&a[r]>a[largest])
		{
			largest=r;
		}
		if(i!=largest)
		{
			int swap=a[i];
			a[i]=a[largest];
			a[largest]=swap;
			heapify(a,N,largest);
		}
	}
	public static void main(String[] args) {
		int a[]={15,78,34,23,14,17,61};
		sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
	}
}