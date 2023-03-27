class Reverse_Letters
{
	public static void main(String[] args) {
		String s="heena";
		String str="";
		int j=s.length()-1;
		while(j!=-1)
		{
			str+=s.charAt(j);
			j--;
		}
		System.out.println(str);
		// str.delete(0,1);
		// str.replace(1,1,"Z");
		// str.insert(1,'Z');
	// 	String s1=new String(str);
	// 	System.out.println(s1);
	// 		String g="";
	// g=g+s.charAt(0);
	// System.out.println(g);
	}

}