class Solution 
{
    public int singleNonDuplicate(int[] nums) 
    {
        int n=nums.length;

        
        if(n==0) return -1;
        if(n==1) return nums[0];
        if(nums[n-1]!=nums[n-2]) return nums[n-1];

        for(int i=0;i<n-1;)
        {   
            if(nums[i]==nums[i+1])
                i+=2;
            
            else 
                return nums[i];
        }

        return -1;
    //     int left=0,right=n-1,mid;
    //     while(left<=right)
    //     {
    //         mid=left+(right-left)/2;
    //         if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1])
    //         {
    //             return nums[mid];
    //         }

    //         else if
    //     }
    }
}