import java.util.*;
class ThreeSum
{
	public static void main(String[] args) {
		int a[]=new int[]{-1,-1,2,4,0,1,-4};
		Arrays.sort(a);
		// for(int i:a)
		// {
		// 	System.out.print(i);
		// }
		int arr[][]=new int[a.length][3];
		int b,e,val,j=0;
		for(int i=0;i<a.length-2;i++)
		{
			b=i+1;
			e=a.length-1;
			while(b<e)
			{
				val=a[b]+a[e]+a[i];
				if(val==0)
				{
					arr[j][0]=a[i];
					arr[j][1]=a[b];
					arr[j][2]=a[e];
					j++;
					b++;
					e--;
				}
				if(val<0)
				{
					b++;
				}
				if(val>0)
				{
					e--;
				}
			}
			
		}
		// j=0;
		System.out.print("[");
		for(int i=0;i<j;i++)
		{
			System.out.print("[");
			for(int k=0;k<arr[0].length;k++)
			{
				System.out.print(arr[i][k]+",");
			}
			System.out.print("]");
		}
		System.out.print("]");
	}
}