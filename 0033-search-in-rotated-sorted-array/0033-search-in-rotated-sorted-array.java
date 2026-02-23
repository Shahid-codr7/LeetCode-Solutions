class Solution 
{
    public int search(int[] nums, int target) 
    {
        int i,n=nums.length;

        // Edge case
        if(n==0) return -1;
        if(n==1)
        {
            if (nums[0]==target)
                return 0;
            else
                return -1;
        }

        int left=0,right=n-1,mid=0;
        while(left<=right)
        {
            mid=left+(right-left)/2;
            if(nums[mid]==target)
            {
                return mid;
            }

            // To check if left subarray is sorted
            else if(nums[left] <= nums[mid])
            {
                // To check if target is present in the left subarray
                if(nums[left] <= target && target < nums[mid])
                {
                    right=mid-1;
                }

                else
                {
                    left=mid+1;
                }
            }

            // To check if right subarray is sorted
            else
            {
                // To check if target is present in the right subarray
                if(nums[mid] < target && target <= nums[right])
                {
                    left=mid+1;
                }

                else
                {
                    right=mid-1;
                }
            }
        }

        return -1;
    }
}