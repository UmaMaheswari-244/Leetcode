class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int dp[] = new int[amount+1];
        for(int i=0;i<amount+1;i++){
            dp[i] = amount+1;
        }
        dp[0] = 0;
        for(int i=0;i<=amount;i++){
            for(int j=0;j<n;j++){
                if(i-coins[j] >= 0){
                    dp[i] = Math.min(dp[i], dp[i-coins[j]]+1);
                }
            }
        }
        return dp[amount]>amount ? -1:dp[amount];
    }
}