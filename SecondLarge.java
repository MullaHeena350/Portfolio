class SecondLarge
{
	public static void printSecond(int a[])
	{
		int first=-1000000,second=-1000000;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>first)
			{
				second=first;
				first=a[i];
			}
			else if(a[i]>second&&a[i]<first)
			{
				second=a[i];
			}
		}
		if(second==-1000000)
		{
			System.out.println("no second elements");
		}
		else
		{
			System.out.println("Elemnt is "+second);
		}
	}
	public static void main(String[] args) {
		int a[]={1,6,7,2,99,34,23,56,100,12};
		// int a[]={10,10,10,10};
		printSecond(a);

	}
}