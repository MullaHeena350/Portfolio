import java.util.*;
// class Valid_Anagram
// {
// 	public static void main(String[] args) {
// 		String a="anagram";
// 		String b="nagaram";
// 		HashMap<Character,Integer>map1=new HashMap<>();
// 		HashMap<Character,Integer>map2=new HashMap<>();
// 		map1.put(a.charAt(0),1);
// 		int j;
// 		for(int i=1;i<a.length();i++)
// 		{
// 			if(map1.containsKey(a.charAt(i)))
// 			{
// 				 j=map1.get(a.charAt(i));
// 				map1.put(a.charAt(i),j+1);
// 			}
// 			else
// 			{
// 				map1.put(a.charAt(i),1);
// 			}
// 		}
// 		// HashMap<Character,Integer>map2=new HashMap<>();
// 		map2.put(b.charAt(0),1);
// 		for(int i=1;i<b.length();i++)
// 		{
// 			if(map2.containsKey(b.charAt(i)))
// 			{
// 				 j=map2.get(b.charAt(i));
// 				map2.put(b.charAt(i),j+1);
// 			}
// 			else
// 			{
// 				map2.put(b.charAt(i),1);
// 			}
// 		}
// 		int count=0;
// 		for(int i=0;i<b.length();i++)
// 		{
// 			if(map1.containsKey(b.charAt(i)))
// 			{
// 				int k=map1.get(b.charAt(i));
// 				int h=map2.get(b.charAt(i));
// 				if(k==h)
// 				{
// 					count++;
// 				}
// 			}
// 			else
// 			{
// 				break;
// 			}
// 		}
// 		if(count==a.length())
// 		{
// 			System.out.println("Yes");
// 		}
// 		else
// 		{
// 			System.out.println("No");
// 		}
// 	}
// }
class Valid_Anagram
{
	public static void main(String[] args) {
		String a="anagram";
		String b="nagaamr";
		Map<Character,Integer>map=new HashMap<>();
		char c[]=a.toCharArray();
		int count;
		for(char k:c)
		{
			count=map.getOrDefault(k,0);
			map.put(k,count+1);
			// System.out.println(k +" "+map.get(k));
		}
		int flag=0;
		c=b.toCharArray();
		for(char k:c)
		{
			flag=0;
			 count=map.getOrDefault(k,0);
			
			if(count==0)
			{
				// System.out.println("no");
				flag=1;
				break;
			}
			else
			{
				
				map.put(k,count-1);
				// System.out.print(k+" " +map.get(k));
			}
		}
		if(flag==0)
		{
			System.out.println("yes"+flag);
		}
		else
		{
			System.out.println("no"+flag);
		}
	}
}