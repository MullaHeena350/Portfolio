import java.util.*;
class TwoSum{
	public static void twosum(int arr[],int target){
		HashMap <Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++){
			int diff=target-arr[i];
			if(map.containsKey(diff)){
				System.out.println(i+","+map.get(diff));
				break;
			}
			else{
				map.put(arr[i],i);
			}
		}
	}
	public static void main(String args[]){
		int arr[]={8,2,1,4,5,6,7};
		int target=10;
		twosum(arr,target);
	}
}