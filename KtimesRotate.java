class KtimesRotate
{
	public static void rotate(int a[],int k)
	{
		k=k%a.length;
		for(int i=0;i<a.length;i++)
		{
			if(i<k)
			{
				System.out.print(a[a.length+i-k]+" ");
			}
			else
			{
				System.out.print(a[i-k]+" ");
			}
		}
	}
	public static void main(String[] args) {
		int a[]=new int[]{1,2,3,4,5};
		int k=6;
		rotate(a,k);
	}
}