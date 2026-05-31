class Solution {
    static int CountWays(int n,int[] dp){
        if(n==0|| n==1)
        return 1;
        if(dp[n]!=-1)
        return dp[n];
        return dp[n]=CountWays(n-1,dp)+CountWays(n-2,dp);
    }
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return CountWays(n,dp);

    }
}