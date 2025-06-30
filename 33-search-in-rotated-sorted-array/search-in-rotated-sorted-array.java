import java.util.*;
class Solution 
{
    public int search(int[] nums, int target) 
    {
        int n=nums.length;
        int st=0, end=n-1,mid;
        while(st<=end)
        {
            mid = st + ((end-st)/2);
            if(nums[mid]==target)
            {
                return mid;
            }

            if(nums[st]<=nums[mid]) // Check Left sub-array Sorted
            {
                // Check Target exists in left sub-array or not
                if(nums[st]<=target && target<=nums[mid])
                {
                    // Target exists
                    end=mid-1;
                }
                else
                {
                    // Target does not exist in left sub array 
                    // Search in right sub-array from next iteration
                    st = mid+1;
                }
            }

            else if(nums[mid]<=nums[end]) // Check Right sub-array Sorted
            {
                // Check Target exists in right sub-array or not
                if (nums[mid] <= target && target <= nums[end]) 
                {
                    // Target exists
                    st=mid+1;
                }
                else
                {
                    // Target does not exist in right sub array
                    // Search in left sub-array from next iteration
                    end=mid-1;
                }
            }
        }

        return -1;
    }
}