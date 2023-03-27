// -------------------------USING HASHMAP------------------------
import java.util.*;
class Frequency
{
	public static void main(String[] args) {
		String str="Heenajuned";
		int s;
		HashMap<Character,Integer> map=new HashMap<>();
		// map.put(str.charAt(0),1);
		// for(int i=1;i<str.length();i++)
		// {
		// 	if(map.containsKey(str.charAt(i)))
		// 	{
		// 		s+=map.get(str.charAt(i));

		// 		map.put(str.charAt(i),s);
		// 	}
		// 	else
		// 	{
		// 		map.put(str.charAt(i),1);
		// 	}
			
		// }
		// System.out.print("{ ");
		// for(Map.Entry<Character,Integer>e:map.entrySet())
		// {
		// 	System.out.print(e.getKey()+":"+e.getValue()+" ");
		// }
		// System.out.println("}");
		for(int i=0;i<str.length();i++)
		{
			s=map.getOrDefault(str.charAt(i),0);
			map.put(str.charAt(i),s+1);
		}
		for(Map.Entry<Character,Integer>emp:map.entrySet())
		{
			System.out.print(emp.getKey()+":"+emp.getValue()+", ");
		}


	}
}
// ----------------------------USING LOOP----------------------------------------
class Freq
{
	public static void main(String[] args) {
	

int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1}; 
int store[]=new int[arr.length];
int visited=-1,count;
for(int i=0;i<arr.length;i++)
{
		count=1;
	for(int j=i+1;j<arr.length;j++)
	{
		if(arr[i]==arr[j])
		{
			store[j]=visited;
			count++;
		}
	}
	if(store[i]!=visited)
	{
		store[i]=count;
	}
}
System.out.println("----------------------");
System.out.println("NUMBER "+ "|"+" FREQUENCY");
System.out.println("---------------------");
for(int i=0;i<arr.length;i++)
{
	if(store[i]!=-1)
	{
		System.out.println("     "+arr[i]+" - "+" "+store[i]);
	}	
}
}
}