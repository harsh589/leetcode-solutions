class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0, high = 0;

        // low = max(weights), high = sum(weights)
        for (int w : weights) {
            low = Math.max(low, w);   // sabse bhaari package
            high += w;                // total sum
        }

        while (low < high) {
            int mid = (low + high) / 2;
            if (daysNeeded(weights, mid) <= days) {
                high = mid;           // ye capacity chalti hai, choti try karo
            } else {
                low = mid + 1;        // capacity badhao
            }
        }
        return low;
    }

    // Given capacity pe kitne din lagenge?
    private int daysNeeded(int[] weights, int capacity) {
        int daysCount = 1, current = 0;
        for (int w : weights) {
            if (current + w > capacity) {   // aaj ka din bhar gaya
                daysCount++;                // naya din start
                current = 0;
            }
            current += w;
        }
        return daysCount;
    }
}