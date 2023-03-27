class Remove_Consecutive
{
	public static void main(String[] args) 
	{
		String s="aabbcdaddefaiiid";
		StringBuffer str=new StringBuffer("");
		int i;
		int k=1;
		str.append(s.charAt(0));
		for(i=0;i<s.length();i++)
		{
			if(str.charAt(str.length()-1)!=s.charAt(i))
			{
				str.append(s.charAt(i));

			}
		}
		// str.delete(7,'e');
		System.out.println(str);
	}
}