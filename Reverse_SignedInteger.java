/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 Input: x = 123
Output: 321
Input: x = -123
Output: -321
*/
class Solution {
    public int check(String s)
    {   int x=0;
        try{
            x=Integer.parseInt(s);
        }
        catch(NumberFormatException e){
            System.out.print(e);
        }
        return x;
    }
    public int reverse(int x) {
        String s="",str="";
        int k=0;
        s=Integer.toString(x);
        int i=s.length()-1;
        while(i>=0)
        {
            if(s.charAt(i)!='-')
            {
              str=str+s.charAt(i);
            }
            i--;
        }
        x=check(str);
        k=x;
        if(s.charAt(0)=='-')
        {
            k=-x;
        }
        if(k>=Math.pow(-2,31)&&k<=Math.pow(2,31)-1)
        {return k;}
        else
        {
            return 0;
        }
    }
}