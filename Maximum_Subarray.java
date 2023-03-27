// class Maximum_Subarray
// {
// 	static int[] SubArray(int a[])
// 	{
// 		int MAX_SUM=-1000000;
// 		int sum,start=-1,end=-1;
// 		for(int i=0;i<a.length;i++)
// 		{
// 			sum=0;
// 			for(int j=i;j<a.length;j++)
// 			{
// 				sum+=a[j];
// 				if(sum>MAX_SUM)
// 				{
// 					MAX_SUM=sum;
// 					start=i;
// 					end=j;
// 				}
// 			}
// 		}
// 		int output[]=new int[3];
// 		output[0]=start;
// 		output[1]=end;
// 		output[2]=MAX_SUM;
// 		return output;
// 	}
// 	public static void main(String[] args) {
// 		// int array[]=new int[]{1,6,3,9,4,5,6,3};
// 		 int array[] = { -35, 32, -24, 0, 27, -10, 0, -19 };
// 		// int array[]=new int[]{-3,4,-2,5,-5,1,2,-2};
// 		int output[]=new int[3];
// 		output=SubArray(array);
// 		System.out.print("{");
// 		for(int i=output[0];i<=output[1];i++)
// 		{
// 			System.out.print(array[i]+",");
// 		}
// 		System.out.println("}");
// 		System.out.println("and the sum is"+output[2]);

// 	}
// }
// ---------------USING SINGLE LOOP--------the maximum sum 2*s1-s(where s1 is maximum subarray and s is total sum)-----------
// Java program to find the maximum
// sum after given operations

import java.io.*;

// class GFG {

// // Function to calculate Maximum Subarray Sum
// // or Kadane's Algorithm
// // 	Input : arr[] = {-1, 10, -5, 10, -2}
// // Output : 18
// // After 1st operation : 1 10 -5 10 -2
// // After 2nd operation : 1 10 -5 10 2

// // Input : arr[] = {-9, -8, -7}
// // Output : 24
// // After 1st operation : 9 8 -7
// // After 2nd operation : 9 8 7
// static int maxSubArraySum(int a[], int size)
// {
// 	int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

// 	for (int i = 0; i < size; i++) {
// 		max_ending_here = max_ending_here + a[i];
// 		if (max_so_far < max_ending_here)
// 			max_so_far = max_ending_here;

// 		if (max_ending_here < 0)
// 			max_ending_here = 0;
// 	}
// 	return max_so_far;
// }

// // Function to find the maximum
// // sum after given operations
// static int maxSum(int a[], int n)
// {
// 	// To store sum of all elements
// 	int S = 0;

// 	// Maximum sum of a subarray
// 	int S1 = maxSubArraySum(a, n);

// 	// Calculate the sum of all elements
// 	for (int i = 0; i < n; i++)
// 		S += a[i];

// 	return (2 * S1 - S);
// }

// // Driver Code


// 	public static void main (String[] args) {
// 	int a[] = { -35, 32, -24, 0, 27, -10, 0, -19 };

// 	// size of an array
// 	int n = a.length;

// 	System.out.println( maxSum(a, n));
// 	}
// }
// This code is contributed by inder_verma
class Heena
{
	public static void main(String[] args) {
		int a[]={-35, 32, -24, 0, 27, -10, 0, -19};
		int x=-a[0], y=-a[a.length-1];
		System.out.println(x+" "+y);
		int sum1=0,sum2=0;
		for(int i=0;i<a.length;i++)
		{
			if(i==0)
			{
				sum1+=x;
			}
			else
			{
				sum1+=a[i];
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(i==0 )
			{
				sum2+=x;
			}
			else if(i==a.length-1)
			{
				sum2+=y;
			}
			else
			{
				sum2+=a[i];
			}
		}
		if(sum1>sum2)
		{
			System.out.println("sum is:"+sum1);
		}
		else
		{
			System.out.println("sum is:"+sum2);
		}
	}
}