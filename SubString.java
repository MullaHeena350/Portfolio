import java.lang.Math;
class SubString
{
	public static void substring(String s)
	{
	// 	StringBuffer str=new StringBuffer();
	// 	int n=0,k;
	// 	StringBuffer d=new StringBuffer();
	// 	for(int i=0;i<s.length();i++)
	// 	{
	// 			str.delete(0,str.length());
				
	// 			int f=0;
	// 		for(int j=i+1;j<s.length();j++)
	// 		{	
	// 			if(s.charAt(i)!=s.charAt(j))
	// 			{
	// 				// str.append(s.charAt(i));
	// 				// str.append(s.charAt(j));
	// 				k=j-1;
	// 				while(k>i)
	// 				{
	// 					if(s.charAt(k)!=s.charAt(j))
	// 					{
	// 						str.append(s.charAt(k));
	// 						// System.out.println(str);
	// 						k--;
	// 					}
	// 					else
	// 					{
	// 						f=1;
	// 						break;
	// 					}
	// 				}
	// 			}
	// 			else{
	// 				break;
	// 			}
	// 		}
	// 		if(str.length()>d.length())
	// 		{
	// 			// n=str.length();
	// 			d.delete(0,d.length());
	// 			d.append(str);
	// 			System.out.println(d.length());	
	// 		}
			
	// 	}
	// 	System.out.println(d +" length with "+d.length());
		int N=s.length(),res=0;
		for(int i=0;i<N;i++)
		{
			boolean a[]=new boolean[256];
			for(int j=i;j<N;j++)
			{
				if(a[s.charAt(j)]==true)
				{
					break;
				}
				else
				{
					if(res<j-i+1)
					{
						res=j-i+1;
					}
					a[s.charAt(j)]=true;
				}
			}
		}
		System.out.println(res);
}

	public static void main(String[] args) {
		String s="geeksforgeeks";
		substring(s);
	}
}
class Solution {
    public static int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int mostFreqLetter = 0;
        int left = 0;
        int max = 0;
        for(int right = 0; right < s.length(); right++)
        {
            freq[s.charAt(right) - 'A']+=1;
            mostFreqLetter = Math.max(mostFreqLetter, freq[s.charAt(right) - 'A']);
            int lettersToChange = (right - left + 1) - mostFreqLetter;
            if(lettersToChange > k)
            {
                freq[s.charAt(left) - 'A']-=1;
                left++;
            }
            max = Math.max(max, right - left + 1);
		}        
        return max;
    }
    public static void main(String[] args) {
    	System.out.println(characterReplacement("GEEKSHEENA",2));
    }
}