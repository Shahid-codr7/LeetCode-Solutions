 class Solution 
{
    public void rotate(int[][] matrix) 
    {
        // Don't try Brute it will take O(n^2) both in Time and Space
        // This is the Optimal solution: First Transpose -> Reverse each row -> Final ans

        // 1. Transpose
        int i,j,n=matrix.length,l=0,r=n-1,temp;
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(i!=j)
                {
                    // swap(i,j,matrix);
                    temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }

        // 2. Reverse each row
        for(i=0;i<n;i++)
        {
            l=0;
            r=n-1;
            while(l<r)
            {
                // swap(l,r,matrix[i]);
                temp=matrix[i][l];
                matrix[i][l]=matrix[i][r];
                matrix[i][r]=temp;
                l++;
                r--;
            }
        }

    }
}