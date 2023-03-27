// -----------------To chcek armstrong number-------------------------
class Armstrong
{
	static int pow(int n,int p)
	{
		int s=1;
		for(int i=0;i<p;i++)
		{
			s*=n;
		}
		return s;
	}
		public static void main(String[] args)
		 {
		int num=370,sum=0,l=0;
		int temp=num;
		while(temp!=0)
		{
			l++;
			temp/=10;
		}
		temp=num;
		while(temp!=0)
		{
			sum+=pow(temp%10,l);
			temp/=10;
		}
		if(num==sum)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
	}
}
// --------------------------------------Between Range-------------------------
class Arm
{
	public static void main(String[] args) {
		
	}
}