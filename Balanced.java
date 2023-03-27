import java.util.Stack;
class Balanced{
	public static boolean paren(String str){
		Stack<Character> s=new Stack<Character>();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='(' || str.charAt(i)=='[' || str.charAt(i)=='{'){
				s.push(str.charAt(i));
			}
			if(s.isEmpty()){
				return false;
			}
			char check;
			switch(str.charAt(i)){
			case ']':
				check=s.pop();
				if(check=='{' || check=='(')
					return false;
				break;
			case ')':
				check=s.pop();
				if(check=='{' || check=='[')
					return false;
				break;
			case '}':
				check=s.pop();
				if(check=='(' || check=='[')
					return false;
				break;
			}

		}
		if(s.isEmpty())
		{
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String args[]){
		String str="[{()}}]";
		if(paren(str)){
			System.out.print("balanced");
		}
		else{
			System.out.print("not balanced");
		}
	}
}