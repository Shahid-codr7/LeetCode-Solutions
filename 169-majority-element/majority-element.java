class Solution 
{
    public int majorityElement(int[] nums) 
    {
        int freq = 0, ans = 0;
        int i,n=nums.length;
        for(i=0; i<n ; i++)
        {
            if(freq==0)
                ans=nums[i];
            if(ans==nums[i])
                freq++;
            else
                freq--;
        }
        return ans;
    }
}