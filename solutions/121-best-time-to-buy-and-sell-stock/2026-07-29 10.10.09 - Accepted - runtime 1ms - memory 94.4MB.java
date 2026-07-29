class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;  // ab tak ka sabse sasta price
        int maxProfit = 0;                 // ab tak ka max profit

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;         
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;  // aaj bechne pe zyada profit mile to update
            }
        }

        return maxProfit;
    }
}