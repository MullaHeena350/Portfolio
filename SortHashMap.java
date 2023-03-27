import java.util.*;
class SortHashMap
{
		static Map<Integer,Integer>map=new HashMap<>();
		static void sortbykeys()
		{
			// TreeMap<Integer,Integer>tree=new TreeMap<>();
			// tree.putAll(map);
			// for(Map.Entry<Integer,Integer> entry:tree.entrySet())
			// {
			// 	System.out.println(entry.getKey());
			// 	// System.out.println(entry.getValue());
			// }
		// --- -------------------------------------------------------------
			// ArrayList<Integer>arr=new ArrayList<>(map.keySet());
			// Collections.sort(arr);
			// for(Integer a:arr)
			// {
			// 	System.out.println(a);
			// }
		// ---- ---------------------------------------------------------------
			ArrayList<Integer>arr=new ArrayList<>();
			for(Map.Entry<Integer,Integer>entry:map.entrySet())
			{
				arr.add(entry.getValue());
			}
			Collections.sort(arr);
			for(Integer i:arr)
			{
				System.out.println(i);
			}
			System.out.println();
		}

	public static void main(String[] args) {
		map.put(78,98);
		map.put(100,93);
		map.put(0,89);
		map.put(34,88);
		map.put(94,99);
		sortbykeys();
		System.out.println(map.size());
		
	}
}