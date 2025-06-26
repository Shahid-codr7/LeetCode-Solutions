class Solution 
{
    public int maxArea(int[] height) // O(n)
    {
        int ind=0;
        int Area=0;
        int i=0,j=height.length-1;
        Area=Math.abs(i-j)*Math.min(height[i],height[j]);

        while(i<j)
        {
            
            if(height[i]<height[j])
            {
                i++;
            }
            else
            {
                j--;
            }
            Area=Math.max(Area,Math.abs(i-j)*Math.min(height[i],height[j]));

        }
        return Area;
    }
}