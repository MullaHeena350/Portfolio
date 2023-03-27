class RotateArray
{
	public static void printRotate(int arr[],int d)
	{
		int p=1;
		while(p<=d)
		{
			int x=arr[0];
			for(int i=0;i<arr.length-1;i++)
			{
				arr[i]=arr[i+1];
			}
			arr[arr.length-1]=x;
			p++;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

		// int temp[]=new int[arr.length];
		// int k=0;
		// for(int i=d;i<arr.length;i++)
		// {
		// 	temp[k]=arr[i];
		// 	k++;
		// }
		// for(int i=0;i<d;i++)
		// {
		// 	temp[k]=arr[i];
		// 	k++;
		// }
		// arr=temp;
		// for(int i=0;i<arr.length;i++)
		// {
		// 	System.out.print(arr[i]+" ");
		// }
	}
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7};
		int d=2;
		printRotate(arr,d);
	}
}