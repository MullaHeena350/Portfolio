import java.util.*;
class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            int start=i+1;
            int end=nums.length-1;
            if(i==0|| nums[i]!=nums[i-1])
            {
                while(start<end)
                {
                    int cur=nums[i]+nums[start]+nums[end];
                    if(cur==0)
                    {
                        res.add(Arrays.asList(nums[i],nums[start],nums[end]));
                        System.out.println("befor"+start);
                        // while(start<end && nums[start]==nums[start+1])start++;
                        // while(start<end&&nums[end]==nums[end-1])end--;

                        start++;
                        end--;
                        System.out.println("after"+start);
                    }
                    else if(cur>0)
                    {
                        end--;
                    }
                    else
                    {
                        start++;
                    }
                }
            }
        }
        return res;
}
}
class SumThree
{
    public static void main(String[] args) {
        int num[]=new int[]{-1,4,2,0,-1,1,-4,-9,8,-4};
        List<List<Integer>>list=new ArrayList<>();
        Solution s=new Solution();
        list =s.threeSum(num);
        System.out.println(list);
    }
}