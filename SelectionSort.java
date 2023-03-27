class SelectionSort
{
	public static void sort(int a[])
	{	int j;
		for(int i=0;i<a.length;i++)
		{
			int min=i;;
			for( j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
			}
			int swap=a[min];
			a[min]=a[i];
			a[i]=swap;
		}
	}
	public static void main(String[] args) {
		int a[]={1,8,5,3,2,9,0,7,66,21};
		sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
	}
}