/*
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Input: s = "III"
Output: 3
Explanation: III = 3.
*/
class Solution {
    public int romanToInt(String s) {
        if(s=="I")
        {
            return 1;
        }
        else if(s=="V")
        {
            return 5;
        }
        else if(s=="X")
        {
            return 10;
        }
        else if(s=="L")
        {
            return 50;
        }
        else if(s=="C")
        {
            return 100;
        }
        else if(s=="D")
        {
            return 500;
        }
        else if(s=="M")
        {
            return 1000;
        }
        int sum=0;
      for(int i=0;i<s.length();i++)
      {
          if(s.charAt(i)=='I')
          {
              if(i+1<s.length()&&s.charAt(i+1)=='V')
            {
              sum=sum+4;
              i++;
            }
            else if(i+1<s.length()&&s.charAt(i+1)=='X')
             {
              sum=sum+9;
              i++;
             }
              else{sum=sum+1;}
          }
          else if(s.charAt(i)=='V')
          {
              sum=sum+5;
          }
          else if(s.charAt(i)=='X')
          {  if(i+1<s.length()&&s.charAt(i+1)=='C')
            {
              sum=sum+90;
              i++;
            }
            else if(i+1<s.length()&&s.charAt(i+1)=='L')
              {
                  sum=sum+40;
                  i++;
              }
              else{sum=sum+10;}
              
          }
          else if(s.charAt(i)=='L')
          {
              sum=sum+50;
          }
          else if(s.charAt(i)=='C')
          {
              if(i+1<s.length()&&s.charAt(i+1)=='M')
              {
                  sum=sum+900;
                  i++;
              }
             else if(i+1<s.length()&&s.charAt(i+1)=='D')
              {
                  sum=sum+400;
                  i++;
              }
              else
              {
                  sum=sum+100;
              }  
          }
          else if(s.charAt(i)=='D')
          {
              sum=sum+500;
          }
          else if(s.charAt(i)=='M')
          {
              sum=sum+1000;
          }
      }
      return sum;  
    }
}