class Solution {
    public int findPeakElement(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {  // < hai, <= nahi!

            int mid = (left + right) / 2;

            if (nums[mid] < nums[mid + 1]) {
                // right side mein peak hai
                left = mid + 1;
            } else {
                // left side mein peak hai
                // mid bhi peak ho sakta hai isliye mid+1 nahi
                right = mid;
            }
        }

        // left == right → peak index
        return left;
    }
}