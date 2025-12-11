class Solution 
{
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        // There's only 1 solution that is the OPTIMAL
        int m=matrix.length;            
        int n=matrix[0].length;
        List<Integer> ans = new ArrayList<Integer>();   
        int i,left=0,right=n-1,top=0,bottom=m-1;

        while(top<=bottom && left<=right)
        {
            for(i=left;i<=right;i++)
                ans.add(matrix[top][i]);
            top++;

            for(i=top;i<=bottom;i++)
                ans.add(matrix[i][right]);
            right--;

            if(top<=bottom)
            {
                for(i=right;i>=left;i--)
                    ans.add(matrix[bottom][i]);
                bottom--;
            }
            
            if(left<=right)
            {
                for(i=bottom;i>=top;i--)
                    ans.add(matrix[i][left]);
                left++;
            }
             
        }  

        return ans;       
    }
}