class Segregation
{
	public static void segregate(int a[])
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				count++;
			}
		}
		for(int i=0;i<count;i++)
		{
			a[i]=0;
		}
		for(int i=count;i<a.length;i++)
		{
			a[i]=1;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		int a[]=new int[]{1,0,0,1,0,1,1,0,0,1};
		segregate(a);
	}
}