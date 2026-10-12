class Solution {
    public int maxProfit(int[] prices) {

        int max=0;
        int val=Integer.MAX_VALUE;

        for(int i=0; i<prices.length; i++){
            if(val>prices[i]){
                val=prices[i];
            }
            max=Math.max(max, prices[i]-val);
        }
        return max;
    }
}
