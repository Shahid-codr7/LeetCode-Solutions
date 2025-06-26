class Solution 
{
    public int maxArea(int[] height) 
    {
        // 2pointer approach Optimized approach - O(n)
        double area = 0, maxAr = Integer.MIN_VALUE;
        int n = height.length;
        int i=0, j=n-1;
        int ht;
        while(i<j)
        {
            ht=Math.min(height[i],height[j]);
            area = Math.abs(i-j)*ht;

            maxAr = Math.max(area, maxAr);
            if(area <= maxAr)
            {
                if(height[i]<height[j])
                {
                    i++;
                }
                else
                {
                    j--;
                }

            }   
        }
        return (int)maxAr;
    }
}