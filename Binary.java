class Binary{
	public static void search(int arr[],int start,int end,int key){
		if(start>end){
			return;
		}
		
		else{
			int mid=(start+end)/2;
		 	if(arr[mid]==key){
				System.out.println(mid);
			
			}
			else if(arr[mid]<key){
				search(arr,mid+1,end,key);
			}
			else{
				search(arr,start,mid-1,key);
			}
		}

	}

	public static void main(String argsd[]){
		int arr[]={1,2,3,4,5,6,7,8};
		int n=arr.length;
		search(arr,0,n-1,7);
	}
}