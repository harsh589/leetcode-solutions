class Solution {
    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;                // mil gaya!

            } else if (nums[mid] < target) {
                left = mid + 1;            // right side dekho

            } else {
                right = mid - 1;           // left side dekho
            }
        }

        return -1; // nahi mila
    }
}