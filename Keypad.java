class Keypad
{
	public static void main(String[] args) {
		String str=" GEEKSFORGEEK  S";
		String output[]={"2","22","222","3","33","333","4","44","444","5","55",
		"555","6","66","666","7","77","777","7777","8","88","888","9","99","999","9999"};
		String out="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				out=out+'0';
			}
			else{
				int d=str.charAt(i)-65;
			out=out+output[d];
			}
		}
		System.out.println(out);
	}
}