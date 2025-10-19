class Solution 
{
    // BETTER APPROACH - Time(O(N)
    //                   Space(O(N))
    public int[] twoSum(int[] nums, int target) 
    {
        int a[] = new int[2];
        Map<Integer, Integer> mp = new HashMap<>();
        a[0]=-1;
        a[1]=-1;
        int i,j,l=nums.length,x;
        for(i=0;i<l;i++)
        {
            x=target-nums[i];
            if(mp.containsKey(x))
            {
                a[0]=i;
                a[1]=mp.get(x);
                return a;
            }
            
            mp.put(nums[i],i);
        }
        return a;
    }



    // Greedy Approach - 2 pointers (NOT OPTIMAL)
//     public int[] twoSum(int[] nums, int target) 
//     {
//         Arrays.sort(nums);
//         int a[] = new int[2];
//         a[0]=-1;
//         a[1]=-1;
//         int i=0,sum=0,l=nums.length,j=l-1;
//         while(i<j)
//         {
//             sum=nums[i]+nums[j];
//             if(sum==target)
//             {
//                 a[0]=i;
//                 a[1]=j;
//                 return a;
//             }

//             else if(sum<target)
//                 i++;
            
//             else
//                 j--;                
//         }
//         return a;
//     }




    
}