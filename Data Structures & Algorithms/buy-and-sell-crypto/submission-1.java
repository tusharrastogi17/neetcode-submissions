class Solution {
    // brute Force
    public int maxProfit(int[] prices) {
        int profit=0;
        for(int i=0; i<prices.length-1; i++){
            for(int j=i; j<prices.length; j++){
            System.out.println("i:::: "+ i+ " --j "+ prices[j]+ " : i:: "+ (prices[i]) );
                profit = Math.max(profit, prices[j]-prices[i]);
            }
        }
        return profit;
    }
}
