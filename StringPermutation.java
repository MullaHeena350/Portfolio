import java.util.*;
class StringPermutation
{
    static int c=0,k=5;
    public static void permute(String str,int l,int r)
    {
        if(l==r)
        {
            if(k==c)
            {
                System.out.println("yes");
            }
            System.out.println(str);
            c++;
        }
        else
        {
            for(int i=l;i<=r;i++)
            {
                str=swap(str,l,i);   //For Combinations
                permute(str,l+1,r);
                str=swap(str,l,i);   //Backtracking
            }
        }
    }
    public static String swap(String str,int i,int j)
    {
        char []a=str.toCharArray();
        char temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        return String.valueOf(a);
    }
    public static void main(String[] args) {
        String str="1234";
        permute(str,0,str.length()-1);
    }
}







 
class GFG {
 
    static void permute(String s, String answer)
    {
        if (s.length() == 0) {
            System.out.print(answer + "  ");
            return;
        }
 
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String left_substr = s.substring(0, i);
            String right_substr = s.substring(i + 1);
            String rest = left_substr + right_substr;
            permute(rest, answer + ch);
        }
    }
 
    // Driver code
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
 
        String s = "ABC";
        String answer = "";
 
        System.out.print("\nAll possible strings are : ");
        permute(s, answer);
    }
}