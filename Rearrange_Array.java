import java.util.*;
class Rearrange_Array
{
	public static void rearrange(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==i)
				{
					int swap=a[i];
					a[i]=a[j];
					a[j]=swap;
				}
			}
		}
	}
	public static void rearrangeOddEven(int a[])
	{
		int b[]=new int[a.length];
		int p,q,i,j;
		for(i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		Arrays.sort(b);
/* ------------------------------------------------------------------------------------------------
	in b we have ascending order so first elements are
  			small compared to last soo storing these small into even postion
 --------------------------------------------------------------------------------------------------*/
		p=0;q=a.length-1;
		for(i=a.length-1;i>=0;i--)
		{
			if(i%2==0)
			{
				a[i]=b[p];
				p++;
			}
			else
			{
				a[i]=b[q];
				q--;
			}
		}
	}
	public static void postive_negative(int a[])
	{
		int i=-1;
		for(int j=0;j<a.length;j++)
		{
			if(a[j]<0)
			{
				i++;
				int swap=a[i];
				a[i]=a[j];
				a[j]=swap;
			}
		}
		int pos=i+1,neg=0;
		while(pos<a.length && neg<pos && a[neg]<0)
		{
			int temp=a[neg];
			a[neg]=a[pos];
			a[pos]=temp;
			pos++;
			neg+=2;
		}
	}
	public static void main(String[] args) {
		// int a[]={-1,2,3,4,5,6,7,8,9,-2,-4,0};
		int a[] = { -1, -1, 6, 1, 9, 3, 2, -1, 4, -1 };
		rearrange(a);
		int t[]={1, 2, 1, 4, 5, 6, 8, 8};
		rearrangeOddEven(t);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<t.length;i++)
		{
			System.out.print(t[i]+" ");
		}
		int d[]={-1, 2, -3, 4, 5, 6, -7, 8, 9};
		postive_negative(d);
		System.out.println();
		for(int i=0;i<d.length;i++)
		{
			System.out.print(d[i]+" ");
		}
	}
}