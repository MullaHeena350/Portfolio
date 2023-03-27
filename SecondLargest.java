import java.util.*;
class SecondLargest
{
	public static void main(String[] args) {
		// int a[]={10,10,10,10,9,7};
		int a[]={10,10,10,10};
		// Arrays.sort(a);
		// int f=0;
		// for(int i=a.length-2;i>=0;i--)
		// {	 f=0;
		// 	if(a[i]<a[a.length-1])
		// 	{
		// 		System.out.println(a[i]);
		// 		f=1;
		// 		break;
		// 	}
		// }
		// if(f==0)
		// {
		// 	System.out.println("no");
		// }
		// int max=-1000;
		// int m=a[0];
		// for(int i=0;i<a.length;i++)
		// {
		// 	if(a[i]>max)
		// 	{
		// 		max=a[i];
		// 		//m=max;


		// 	}
		// 	if(a[i]<max && m>a[i+1] && i+1<a.length)
		// 	{
		// 		m=a[i];
		// 	}
		// }
		// System.out.println(m);
		// int n=72;
		// int count=0;
		// for(int i=2;i<=n;i++)
		// {
		// 	if(n%i==0)
		// 	{
		// 		count++;
		// 	}
		// }
		// if(count==1)
		// {
		// 	System.out.println("yes");
		// }
		int largest=-10000000	;
		int l=largest;
		int second=largest;
		int flag=0;
		for(int i=0;i<a.length;i++)
		{	
			if(a[i]>largest)
			{second=largest;
				largest=a[i];
				flag=1;
				
			}
			else if(second<a[i] && a[i]<largest)
			{
				second=a[i];
				flag=1;
			}
		}
		if(flag==1)
		{
			if(second==l)
			{
				System.out.println("no");
			}
			else
			{
				System.out.println(second);
			}

			
		}
		else
		{
			System.out.print("No Second Largest Number");
		}
		// String s="tanheera heena";
		// System.out.println(s.substring(3,6));



		int num=9;
		if(num>=10 && num<=20)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("No");
		}

	}
}
// class B 
// {
// 	static int[] maxSubArray(int[] nums) {
 
//     int n = nums.length;
//     int maximumSubArraySum = Integer.MIN_VALUE;
//     int start = 0;
//     int end = 0;
 
//     for (int left = 0; left < n; left++) {
 
//         int runningWindowSum = 0;
 
//         for (int right = left; right < n; right++) {
//             runningWindowSum += nums[right];
 
//             if (runningWindowSum > maximumSubArraySum) {
//                 maximumSubArraySum = runningWindowSum;
//                 start = left;
//                 end = right;
//             }
//         }
//     }
//    // System.out.println( "Found Maximum Subarray between {} and {}", start, end);
//     int m[]=new int[3];
//   	m[0]=maximumSubArraySum;
//   	m[1]=start;
//   	m[2]=end;
//     return m;
// }
// 	public static void main(String[] args) 
// 	{
// 		// int a=30;
// 		// if (a%3==0)
// 		// {
//   //       System.out.println(a + "is Divisible by" + 3);
// 		// }
// 		// else if (a%5==0)
// 		// {
// 		// 	System.out.println(a + " is divisible by" + 5);
// 		// }
// 		// else
// 		// {
// 		// System.out.println(a + "is not divisible by both " + 3 + "and" + 5);
// 		// }
// 		int []nums={-3,1,-8,4,-1,2,1,-5,5};
// 		int n[]=maxSubArray( nums) ;
// 		// System.out.println(n);
// 		for(int m:n)
// 		{
// 			System.out.println(m);
// 		}
// 	}
// }
class Solution {
 //    static int search(int[] nums, int target) {
 //      int start=0;
 //       int last=nums.length-1;
 //       int mid;
 //       // Arrays.sort(nums);
 //       // for(int n:nums)
 //       // {
 //       // 	System.out.println(n);
 //       // }
 //       while(start<last)
 //       {
 //        mid=(start+last)/2;

 //       if(nums[mid]==target)
 //       {
 //       		System.out.println(mid);
 //           return mid;
 //           // break;
 //       }
 //        else if(nums[mid]<target)
 //        {
 //            start=mid+1;
 //            // last=last
 //        }
 //        else
 //        {
 //            last=mid;
 //        }
 //  }
 //       return -1;
        
 // }
 // public static void main(String[] args) {
 // 	int nums[]={4,5,6,7,0,1,2};
 // 	int m=search(nums,3);
 // 	System.out.println(m);
 // 	System.out.println("E");
 // }s="0nlci id;;ihdiw   ijdie ;,kj"
		static boolean isPalindrome(String s) 
		{
		int flag=0;
        int i=0;
        int f=0;
        int j=s.length()-1;
        while(i<j)
        {
        	// flag=0;
        	if(!(s.charAt(i)>='a'&&s.charAt(i)<='z'))
        	{
        		i++;
        	}
        	else if(!(s.charAt(j)>='a' && s.charAt(j)<='z'))
        	{
        		j--;
        	}
        	else if(s.charAt(i)==s.charAt(j)&& (s.charAt(j)>='a' && s.charAt(j)<='z'))
        		{
        			j--;
        			i++;
        			flag=1;
        			System.out.println("true");
        		}
        	else
        		{
        			f=1;
        			break;
        		}
        
        }
        if(flag==1 && f==0)
        {
        	return true;
        }
        else
        {
        	return false;
        }
    }
        
        // while(i<j)
        // {
        // 									if(s.charAt(i)>='A' && s.charAt(i)<='Z' )
								// 	         {
								// 	            	if( s.charAt(j)>'a' && s.charAt(j)<='z')
								// 	            	{
								// 	            		int n=(int)s.charAt(i)+32;
								// 	            		char c=(char)n;
								// 	               		 if(s.charAt(j)==c)
								// 	               		 {
								// 		                    j--;
								// 		                    i++;
								// 		                    flag=0;

										                    
								// 	               		 }
								// 	               		 else{
								// 	            			 flag=1;
								// 	            			break;
								// 	            			}
								// 	            	}
								// 		            else if(s.charAt(j)>'A' && s.charAt(j)<='Z')
								// 		            {
								// 		            		if(s.charAt(i)==s.charAt(j))
								// 		            		{
								// 		            			i++;
								// 		            			j--;
								// 		            			flag=0;

								// 		            		}
								// 		            		else
								// 		            		{
								// 		            			flag=1;
								// 		            			break;
								// 		            		}
								// 		            }
								// 		            else
								// 		            {
								// 		            		j--;
								// 		            }
								// 		      }
	// 							            else if( s.charAt(i)>='a' && s.charAt(i)<='z')
	// 							            {
	// 							            	if( s.charAt(j)>'a' && s.charAt(j)<='z')
	// 							            	{
	// 							            		//char c=s.charAt(i)+32;
	// 							               		 if(s.charAt(i)==s.charAt(j))
	// 							               		 {
	// 								                    j--;
	// 								                    i++;
	// 								                    flag=0;
	// 							               		 }
	// 							               		 else
	// 							               		 {
	// 							               		 	flag=1;
	// 							               		 	break;
	// 							               		 }
	// 							            	}
	// 									        else if(s.charAt(j)>'A' && s.charAt(j)<='Z')
	// 									         {	int d=(int)s.charAt(j)+32;
	// 									            		char g=(char)d;
	// 										            		if(s.charAt(i)==g)
	// 										            		{
	// 										            			i++;
	// 										            			j--;
	// 										            			flag=0;

	// 										            		}
	// 										            		else
	// 										            		 {
	// 										            		 	flag=1;
	// 										            			break;
	// 										            		}
	// 									          }
	// 									          else
	// 									          {
	// 									            		j--;
	// 									          }
	// 									  }
	// 									   else
	// 							            {
	// 							            	i++;
	// 							          }
	// 	}
            
		
	// if(flag==0)
	// {
	// 	return true;
	// }
	// else
	// {
	// 	return false;
	// }
// }

	public static void main(String[] args) {
		//String s="malayal;am;. malay ;alam";//A man, a plan, a canal: Panama
		// String s="A Man, a plan, a canal: Panama";
		// String s="race a car";
		// String s="0P";
		String s="a.";
		String	str="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				int n=(int)s.charAt(i)+32;
				char c=(char)n;
				str=str+c;
			}
			else
			{
				str=str+s.charAt(i);
			}
		}
		System.out.println(str);
		boolean b=isPalindrome(str);

		System.out.println(b);
	
	}
}