class Solution {
    public int maxProfit(int[] prices) {
        int total = 0;
        for (int i = prices.length - 1; i > 0; i--) {
            if (prices[i] > prices[i-1]) {
                total += (prices[i] - prices[i-1]);
            }
        }
        return total;
    }
}
