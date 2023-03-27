class Sqrt{
	public static void mysqrt(int n){
		int end=n;
		int res=0;
		if(n==0){
			return;
		}
		else{
			while(start<=end){
				int mid=(start+end)/2;
			
				if(mid<=n/mid){
					res=mid;
					start=mid+1;
				}
				else{
					end=mid-1;
			}
			
		}
	}
	System.out.println(res);
}
		int start=1;
	public static void main(String args[]){
		int n=25;
		mysqrt(n);
	}
}