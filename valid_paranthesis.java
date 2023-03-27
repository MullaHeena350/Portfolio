class valid_paranthesis
{
	public static void main(String[] args)
	{
	String s="((a+b)+{a+b})l";
	 StringBuffer empty=new StringBuffer();
	 int i=0,j=0,k;
	 char c;
	 while(i<s.length())
	 {
	 	if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{')
	 	{
	 		empty.append(s.charAt(i));
	 	}
	 	else if(s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']')
	 	{	
	 		k=empty.length()-1;
			if(k!=-1)
			{
				c=empty.charAt(k);
			
	 		if(s.charAt(i)==')')
	 		{
	 			if(c=='(')
	 			{
	 				empty.delete(k,k+1);
	 				k--;
	 			}
	 		}
	 		else if(s.charAt(i)=='}')
	 		{
	 			if(c=='{')
	 			{
	 				empty.delete(k,k+1);
	 			k--;
	 			}
	 				
	 		}
	 		else if(s.charAt(i)==']')
	 		{
	 			if(c=='[')
	 			{
	 				empty.delete(k,k+1);
	 				k--;
	 			}
	 		}
			}
	 	}
	 	i++;
	 }
		if(empty.length()==0)
		{
			System.out.println("yes"+empty);
		}
		else
		{
			System.out.println("no"+empty);
		}
	}
}