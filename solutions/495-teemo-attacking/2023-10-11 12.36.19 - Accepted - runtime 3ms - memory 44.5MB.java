class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int res = duration;
        int prev =timeSeries[0];

        for(int i=1;i<timeSeries.length;i++){
            if(timeSeries[i]<=timeSeries[i-1]+duration){
                res+=timeSeries[i]-timeSeries[i-1];
            }
            else{
                res+=duration;
            }
        }
        return res;
    }
}