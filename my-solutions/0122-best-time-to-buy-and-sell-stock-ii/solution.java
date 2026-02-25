class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        for(int i=0;i<prices.length-1;i++){
            int j=i+1;
            if(prices[i]<prices[j]){
                int sum=prices[j]-prices[i];
                profit+=sum;
            }
        }
        return profit;
    }
}
