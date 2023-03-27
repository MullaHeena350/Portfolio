// ----------------------------FOR RIGHT ROTATION----------------------------------
class ReversalAlgorithm
{
	public static void rightRotate(int a[], int i,int n)
	{	int d=i;
		reverse(a,0,n-1);
		reverse(a,0,d-1);
		reverse(a,d,n-1);
	}
	public static void reverse(int a[], int i,int n)
	{
		while(i<n)
		{
			int temp=a[i];
			a[i]=a[n];
			a[n]=temp;
			i++;
			n--;
		}
	}
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6,7,8,9};
		int d=3;
		rightRotate(a,3,a.length);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
// ----------------------FOR LEFT ROTATION-------------------------------------------
class LeftReversal
{
	public static void leftRotate(int a[],int i,int n)
	{
		int d=i,k=n-1-d;
		reverse(a,0,n-1);
		reverse(a,0,k);
		reverse(a,k+1,n-1);

	}
	public static void reverse(int a[],int i,int n)
	{
		while(i<n)
		{
			int temp=a[i];
			a[i]=a[n];
			a[n]=temp;
			i++;
			n--;
		}
	}
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,6,7};
		int d=2;
		leftRotate(a,d,a.length);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}