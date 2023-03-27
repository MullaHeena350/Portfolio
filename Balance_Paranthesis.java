import java.util.Stack;
class Balance_Paranthesis
{
	static boolean balance(String str)
	{
		Stack<Character>stack=new Stack<>();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='['||str.charAt(i)=='{'||str.charAt(i)=='(')
			{
				stack.push(str.charAt(i));
			}
			if(stack.isEmpty())
			{
				return false;
			}
			char check;
			switch(str.charAt(i))
			{
			case ')':
				check=stack.pop(); 
				if(check=='{'||check=='[')
				{
					return false;
				}
				break;
			case '}':
				check=stack.pop();
				if(check=='('||check=='[')
				{
					return false;
				}
				break;
			case ']':
				check=stack.pop();
				if(check=='}'||check=='}')
				{
					return false;
				}
				break;
			}
		}
	return stack.isEmpty();
	}
	public static void main(String[] args) {
		String str= "([{}])";
		if(balance(str))
		{
			System.out.println("Balanced");
		}
		else
		{
			System.out.println("Not Balanced");
		}
	}
}