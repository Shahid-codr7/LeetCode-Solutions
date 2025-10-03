class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        int i, j=0, l=nums.length;
        for(i=1;i<l;i++)
        {
            if(nums[i]!=nums[j])
            {
                nums[++j]=nums[i];
            }
        }

        return j+1;
    }
}