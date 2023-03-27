// ------------------------For Number------------------
class Palindrome
{
	public static void main(String[] args) {
		int num=141;
		int temp=num;
		int sum=0;
		while(temp!=0)
		{
			sum=sum*10+temp%10;
			temp/=10;
		}
		if(num==sum)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("No");
		}
		
	}
}
// ------------------------For String-------------------
class Pal
{
	public static void main(String[] args) {
		String str="malayyalam";
int i=0,j=str.length()-1,flag=0;
while(i!=j)
{
	 flag=0;
	if(str.charAt(i)==str.charAt(j))
	{
		i++;
		j--;
	}
	else
	{
			flag=1;
		break;
	}
}
if(flag==0)
{
	System.out.println("yes");
}
else
{
	System.out.println("no");
}
	}
}

