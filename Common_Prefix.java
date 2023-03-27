class Solution {
    public static  String longestCommonPrefix(String[] strs) {
        String d="";
        int f=0;
        if(strs.length>1)
        {
             for(int j=0;j<strs[0].length() && j<strs[1].length();j++)
                {
                   if(strs[0].charAt(j)==strs[1].charAt(j))
                   {
                      d=d+strs[0].charAt(j);
                   }
                   else
                   {
                       break;
                   }
                }
                if(d.length()!=0 && strs.length>2)
                {  
                      for(int i=2;i<strs.length;i++)
                      {
                        String s="";
                         int k=0;
                         s=d;
                         d="";
                         while(k<strs[i].length() && k<s.length())
                         { 
                             if(s.charAt(k)==strs[i].charAt(k))
                             {
                                 d=d+strs[i].charAt(k);
                                  k++;
                             }
                             else
                             {
                                 break;
                             }
                         }
                      }
                      return d;
                }
                else
                {
                    return d;
                }
        }
        else
        {
            return strs[0];
        }
    }
    public static void main(String[] args) {
        // strs=["a"] output "a"
        // strs=["rac","hef","kil"] output ""
        String strs[]={"flower","flow","flight"}; // output "fl"
        String s=longestCommonPrefix(strs);
        System.out.println(s);

    }
}