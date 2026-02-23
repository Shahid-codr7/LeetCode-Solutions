class Solution 
{
    public int[] searchRange(int[] nums, int target) 
    {
        if(nums.length==0)
        {
            return new int[]{-1,-1};
        }

        int left=0, right=nums.length-1, mid=0, ans1=0, ans2=0;
        while(left<=right)
        {
            mid=left+(right-left)/2;

            if(nums[mid]>=target) // For right element
            {
                ans2=mid;
                right=mid-1;
            }

            else
            {
                left=mid+1;
            }
        }

        left=0; right=nums.length-1; mid=0; ans1=0;
        while(left<=right)
        {
            mid=left+(right-left)/2;

            if(nums[mid]<=target) // For left element
            {
                ans1=mid;
                left=mid+1;
            }

            else
            {
                right=mid-1;
            }
        }

        int arr[] = {-1, -1};
        if(nums[ans1]==target && nums[ans2]==target)
        {
            arr[0]=ans2;
            arr[1]=ans1;
        }

        return arr;
    }
}