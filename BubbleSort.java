class BubbleSort
{
	public static void bubble(int a[],int n)
	{
		if(n==0||n==1)
		{
			return;
		}
		int flag=1;
		for(int i=0;i<n-1;i++)
		{
			if(a[i]>a[i+1])
			{
				swap(a,i,i+1);
				flag=0;
			}
		}
		if(flag==1)
		{
			return;
		}
		bubble(a,n-1);
}
public static void swap(int a[],int i,int j)
{
	int temp=a[i];
	a[i]=a[j];
	a[j]=temp;
}
	public static void main(String[] args) {
		int a[]={100,2,7,34,56,1,9,4,67};
		bubble(a,a.length);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
}