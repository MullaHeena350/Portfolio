import java.util.*;
class Sentence_Keypad
{
	static String print_keypad(String s,String key[])
	{
		String output="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				output+="0";
			}
			else
			{
				int position= s.charAt(i)-'A';
				output+=key[position];
			}
		}
		return output;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter letters");
		String str=sc.nextLine();
		String keypad[]={
			 "2",    "22",  "222", "3",   "33", "333",
                "4",    "44",  "444", "5",   "55", "555",
                "6",    "66",  "666", "7",   "77", "777",
                "7777", "8",   "88",  "888", "9",  "99",
                "999",  "9999"
		};
	System.out.println(Integer.parseInt(print_keypad(str,keypad)));

	}
}