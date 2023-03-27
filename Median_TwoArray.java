class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int merge[]=new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j< m)
        {
            if(nums1[i]<nums2[j])
            {
                merge[k]=nums1[i];
                i++;
            }
            else
            {
                merge[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<n)
        {
            merge[k]=nums1[i];
            i++;
            k++;
        }
        while(j<m)
        {
            merge[k]=nums2[j];
            k++;
            j++;
        }
        if((n+m)%2==0)
        {
            int s=(0+n+m-1)/2;
            int sum=merge[s]+merge[s+1];
            double f=sum/2f;
            return f;
        }
        else
        {
            int s=(0+n+m-1)/2;
            double f=merge[s];
            return f;
        }
    }
    public static void main(String[] args) {
//         Input: nums1 = [1,3], nums2 = [2]
// Output: 2.00000
// Explanation: merged array = [1,2,3] and median is 2.

// Input: nums1 = [1,2], nums2 = [3,4]
// Output: 2.50000
// Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
        int nums1[]={1,3};
        int nums2[]={2,4};
   double d= findMedianSortedArrays( nums1,nums2) ;
   System.out.println(d);
    }
}

