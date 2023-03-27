// -------------------This is is for insorted array-------------------------
class Array_Duplicates
{
	public static int dupli(int a[])
	{
		int[] temp=new int[a.length];
		// temp[0]=a[0];
		int k,j=0,f=0;
		for(int i=0;i<a.length;i++)
		{
			k=0;
			while(k<j)
			{
				f=0;
				if(a[i]==temp[k])
				{
					f=1;
					break;
				}
				k++;
			}
			if(f==0)
			{
				temp[j]=a[i];
				j++;
			}
		}
		for(int i=0;i<temp.length;i++)
		{
			a[i]=temp[i];
		}
		return j;
	}
// ------------------------------------------------------------------------------------------------------
// ------------------------------for sorted-----------------------------------------------------
	public static int duplicate(int a[])
	{
		int temp[]=new int[a.length];
		int k=0,i,j;
		for( i=0;i<a.length;i++)
		{
			for( j=i+1;j<a.length;j++)
			{
				if(a[i]!=a[j])
				{
					temp[k]=a[i];
					k++;
					break;
				}
			}
			i=j-1;
		}
		temp[k]=a[a.length-1];
		k++;
		for( i=0;i<k;i++)
		{
			a[i]=temp[i];
		}
		return k;
	}
// ---------------------------------------------------------------------------------------------------------
	public static void main(String[] args) {
		int a[]={1,2,3,1,2,1,10,20,3,3,3,1,2,4};
		//
		// int a[]={1,1,2,2,3,5,6,6,7,9,9,9,10,11};
		 int n=dupli(a);
		// int n=duplicate(a);
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}

	}
}