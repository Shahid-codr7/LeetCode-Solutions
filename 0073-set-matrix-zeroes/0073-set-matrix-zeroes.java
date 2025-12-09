class Solution 
{
    public void setZeroes(int[][] matrix) 
    {
        int i,j,col0=1;

        // 1st part
        for(i=0;i<matrix.length;i++)
        {
            for(j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    if(j==0)
                        col0=0;

                    else
                        matrix[0][j]=0;     // 1st row

                    matrix[i][0]=0;         // 1st col
                }
            }
        }

        // 2nd part
        for(i=matrix.length-1;i>=1;i--)
        {
            for(j=matrix[0].length-1;j>=1;j--)
            {
                if(matrix[i][0]==0 || matrix[0][j]==0)
                {
                    matrix[i][j]=0;
                }
            }
        }

        if(matrix[0][0]==0)
        {
            for(j=0;j<matrix[0].length;j++)
            {
                matrix[0][j]=0;
            } 
        }
        

        if(col0==0)
        {
            for(i=0;i<matrix.length;i++)
            {
               matrix[i][0]=0;
            }
        }

    }
        


    /*  Better Approach - (NOT OPTIMAL) 
        Space: O(n+m)
        Time: O(n*m)
    
        int i,j;
        List<Integer> rows = new ArrayList<Integer>();
        List<Integer> cols = new ArrayList<Integer>();
        for(i=0;i<matrix.length;i++)
        {
            for(j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        fillZeroes(rows,cols,matrix);
    }

    public void fillZeroes(List<Integer> rows, List<Integer> cols, int[][] matrix)
    {
        for(int i:rows)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                matrix[i][j]=0;
            }
        }

        for(int a:cols)
        {
            for(int b=0;b<matrix.length;b++)
            {
                matrix[b][a]=0;
            }
        }
    }
    */
}