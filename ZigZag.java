/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
*/
class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1)
        {
            return s;
        }
        String arr[]=new String[numRows];
        for(int i=0;i<numRows;i++)
        {
            arr[i]="";
        }
        int j=0,i=0,k=-1;
        while(i<s.length())
        {
            if(j!=numRows)
            {
                 arr[j]=arr[j]+s.charAt(i);
                 j++;
                 k++;
                 i++;
            }
            else
            {
                 k--; 
             if(j==numRows&&k==-1)
            {
                j=1;
                k=0;
                i--;
            }
            else
            {
                arr[k]=arr[k]+s.charAt(i); 
            }
            i++;
            }
            
             
        }
        s="";
        for( i=0;i<numRows;i++)
        {
            s=s+arr[i];
        }
        return s;
    }
}