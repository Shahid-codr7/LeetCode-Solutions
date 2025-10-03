class Solution 
{
    public boolean check(int[] nums) 
    {
        int i, x=0, ind=0, l=nums.length;
        int B[] = new int[l];
        int c=0;
        for(i=0;i<l-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                c++;    //rotation point detected
                if(c>1) // more than 1 rotation point
                    return false;
                ind=i+1;
            }
        }

        for(i=ind;i<l;i++)
        {
            B[x++]=nums[i];
        }

        for(i=0;i<ind;i++)
        {
            B[x++]=nums[i];
        }

        for(i=0;i<l-1;i++)
        {
            if(B[i]>B[i+1])
                return false;
        }
        
        return true;
    }
}