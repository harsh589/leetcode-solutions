class Solution {
    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (nums[mid] == target) return mid;

            // LEFT half sorted hai?
            if (nums[left] <= nums[mid]) {

                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;  // target left mein hai
                } else {
                    left = mid + 1;   // target right mein hai
                }

            // RIGHT half sorted hai
            } else {

                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;   // target right mein hai
                } else {
                    right = mid - 1;  // target left mein hai
                }
            }
        }

        return -1;
    }
}