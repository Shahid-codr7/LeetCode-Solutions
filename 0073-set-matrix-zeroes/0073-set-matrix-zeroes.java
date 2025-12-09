class Solution 
{
    public void setZeroes(int[][] matrix) 
    {
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
}