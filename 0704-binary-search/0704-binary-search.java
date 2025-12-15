class Solution 
{
    public int search(int[] nums, int target) 
    {
        if(nums.length == 1)
            return (nums[0]==target)?0:-1;

        int left=0, right=nums.length-1, mid=0;
        while(left<=right)
        {
            mid = left + (right - left)/2;
            if(nums[mid] == target)
            {
                return mid;
            }

            else if(nums[mid]>target)
            {
                right=mid-1;
            }

            else
            {
                left=mid+1;
            }
        }
        return -1;
    }
}