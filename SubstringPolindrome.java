//------------Dynamic Programming Approach---------------------------
class main
{
	static void print (String str,int i,int j)
	{
		for(int k=i;k<=j;k++)
		{
			System.out.print(str.charAt(k));
		}
	}
	static void find(String str)
	{
		int n=str.length();
		int maxLength=1,start=-1;
		boolean table[][]=new boolean[n][n];
		// for length 1
		for(int i=0;i<n;i++)
		{
			table[i][i]=true;
		}
		// for length 2
		for(int i=0;i<n-1;i++)
		{
			if(str.charAt(i)==str.charAt(i+1))
			{
				table[i][i+1]=true;
				start=i;
				maxLength=2;
			}
		}
		//for length greater than 2 ..i.e from length 3
		for(int k=3;k<n;k++)
		{
			// to find number of k lengths and also calculating starting index 
			for(int i=0;i<n-k+1;i++)
			{
				int j=i+k-1;
				//now substring from i to j if i+1 to j-1 conatins palindrome then
				// i to j substring is palindrome.
				if(table[i+1][j-1]&&str.charAt(i)==str.charAt(j))
				{
					table[i][j]=true;
					
					if(k>maxLength)
					{
						start=i;
						maxLength=k;
					}
				}
			}
		}
		print(str,start,start+maxLength-1);
	}
	public static void main(String[] args) {
		String str ="ganageeeg";
		find(str);
	}
}
//------------------------------------------------------------------
class SubstringPolindrome
{
	static void palindrome(String str)
	{
		int start,end,flag,maxLength=0,i,j;
		int l=0,h=0;
		for( i=0;i<str.length();i++)
		{
			for( j=i;j<str.length();j++)
			{
				start=i;
				end=j;
				flag=0;
				while(start<end)
				{
					if(str.charAt(start)==str.charAt(end))
					{
						// System.out.print(str.charAt(end)+" ");
						end--;
						start++;
						flag=0;
						// System.out.print(str.charAt(start)+" ");
					}
					else
					{
						flag=1;
						break;
					}
				}
				// System.out.println();
				if(flag==0 && maxLength<j-i)
				{

					maxLength=j-i+1;
					l=i;
					h=j;
					// break;
					// System.out.println(maxLength);
				}
			}
		}
		System.out.println(maxLength);
		for(i=l;i<=h;i++)
		{
			System.out.print(str.charAt(i));
		}
	}
	public static void main(String[] args) {
		// String str="forgeeskseegfor";
		 // String str = "forgeeksskeegfor";
		String str="geeks";
		palindrome(str);
	}
}