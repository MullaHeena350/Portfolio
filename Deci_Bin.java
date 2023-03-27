// import java.util.*;
class Deci_Bin
{
	public static void main(String[] args) {
		int num=11;
		String s="";
		while(num!=0)
		{
			s=(char)num%2+s;
			num=num/2;
		}
		Integer n=Integer.parseInt(s);
		System.out.println(n);
	}
}