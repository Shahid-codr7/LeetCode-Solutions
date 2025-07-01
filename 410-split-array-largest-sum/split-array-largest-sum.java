class Solution {
    public static int splitArray(int[] nums, int k) 
    {
        // Find range of min to max values of "MaxPages"
        // min: 0  X(invalid)
        // max: Total sum of nums[] elements  X(invalid)

        // Find sum of nums[] element

        int i, sum=0, n=nums.length;
        for(i=0;i<n;i++)
        {
            sum+=nums[i];
        }

        int st=0;    // min
        int end=sum; // max
        int mid;
        int MaxPages=-1; // Taking the answer by default -1

        // Implementing Binary Search on the Array from min(0) to max(sum)
        // To get the minimum(optimal) value of "MaxPages"

        while(st<=end)
        {
            mid=st+(end-st)/2;
            if(isValid(mid,nums,k))
            {
                // Greater than the optimal(minimum) solution
                // Search in the left sub-array
                end=mid-1;
                MaxPages= mid;
            }

            else
            {
                // not valid solution or Less than the minimum solution
                // Search in the right sub-array
                st=mid+1;
            }
        }
        
        return MaxPages;
    }

    public static boolean isValid(int mid, int a[], int k) 
    {
        // int x: Value of "MaxPages" to be checked for validity only, not for optimality

        int n=a.length;
        int student=1;    // Counter for number of students (start with 1)
        int pages=0;      // No. of Pages allotted to a student
        for(int i=0;i<n;i++)
        {
            if(a[i]>mid)
                return false;
            if(pages+a[i] <= mid)
            {
                pages+=a[i];
            }
            else
            {
                pages=a[i];
                student++;
            }
        }

        if(student > k)
            return false;
        else
            return true;
    }
}