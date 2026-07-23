class Solution {
    public int maxProfit(int[] prices) {
        int[] Profit = new int[prices.length];
        for(int i =1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                Profit[i]=Profit[i-1]+(prices[i]-prices[i-1]);
            }
            else {
                Profit[i] = Profit[i-1];
            }
        }
        return Profit[prices.length-1];
    }
}
