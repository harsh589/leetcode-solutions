class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1, high = Integer.MIN_VALUE;

        // high = max element
        for (int num : nums) {
            high = Math.max(high, num);
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (getSum(nums, mid) <= threshold) {
                high = mid - 1;   // chhota divisor try karo
            } else {
                low = mid + 1;    // bada divisor chahiye
            }
        }
        return low;
    }

    // divisor d ke liye total sum nikalo
    private int getSum(int[] nums, int d) {
        int sum = 0;
        for (int num : nums) {
            sum += (int) Math.ceil((double) num / d);
        }
        return sum;
    }
}
