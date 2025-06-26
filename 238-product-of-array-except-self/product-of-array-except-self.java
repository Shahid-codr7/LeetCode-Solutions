class Solution 
{
    public  int[] productExceptSelf(int[] nums) {
        int i, n = nums.length;
        int pre = 1, suff = 1;
        // int suff[] = new int[n];
        // int pre[] = new int[n];
        int ans[] = new int[n];
        ans[0] = 1;
        ans[n - 1] = 1;
        // pre[0]=1;
        // suff[n-1]=1;

        for (i = 1; i < n; i++) {
            pre *= nums[i - 1];
            ans[i] = pre;
        }
        for (i = n - 2; i >= 0; i--) {
            suff *= nums[i + 1];
            ans[i] = ans[i] * suff;
        }

        return ans;

    }
}