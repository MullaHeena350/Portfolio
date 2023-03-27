import java.util.*;
class Important
{
	public static void convert(String str)
	{
		try
		{
			int val=0;
			val=Integer.parseInt(str);
		}
		catch(NumberFormatException e)
		{
			System.out.println("INVALID STRING");
		}
		// System.out.println(val);
	}
	public static void main(String[] args) {
		System.out.println("---------------------------------------------------------------------");
		// To convert char to int
		char ch='3';
		int n=ch-'0';//method1
		int n1=Integer.parseInt(String.valueOf(ch)); //method2
		System.out.println("Method1="+n);
		System.out.println("Method2="+n1);
		System.out.println("--------------------------------------------------------------------");

		// convert string to integer
		String str="1233457";
		int num=Integer.parseInt(str);//method1
		System.out.println("this will not rise exception because above contains all integers");
		System.out.println(num);
		str="-1234ljkk";// str=-122333 like this also give error
		convert(str);//method2
		System.out.println("----------------------------------------------------------------");
		// convert Integer to String
		int n2=986;//-908
		 str=Integer.toString(n2);
		System.out.println(str);
		int j=000;
		System.out.print(j);
	}
}