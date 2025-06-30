class Solution {
    public static int singleNonDuplicate(int[] nums) 
    {
        int n=nums.length;
        if(n==0)
            return -1;
        if(n==1)
            return nums[0];
        if(nums[0]!=nums[1])
            return nums[0];
        if(nums[n-1]!=nums[n-2])
            return nums[n-1];
        
        int l=0, r=n-1, mid;
        while (l<=r) 
        {
            mid=l+(r-l)/2;

            if(mid==0 && nums[mid]!=nums[mid+1])
                return nums[mid];

            if(mid==n-1 && nums[mid]!=nums[mid-1])
                return nums[mid];

            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1])
                return nums[mid];

            if(nums[mid]==nums[mid-1])
            { 
                // mid is on the left side of the result
                if((mid-1)%2==0)
                {
                    // Go for Right subarray
                    l=mid+1;
                }
                else
                {
                    // Go for Left subarray 
                    r=mid-2;
                }
            }

            else if(nums[mid] == nums[mid + 1])
            {
                // mid is on the left side of the result
                if (mid % 2 == 0) 
                {
                    // Go for Right subarray
                    l = mid + 2;
                } 
                else 
                {
                    // Go for Left subarray
                    r = mid - 1;
                }
            }

            if(l==r)
                return nums[l];

            
        } 
        return -1;
    }
}