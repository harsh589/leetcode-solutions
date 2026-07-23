class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last  = findLast(nums, target);
        return new int[]{first, last};
    }

    int findFirst(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = (left + right) / 2;  // ✅ brackets

            if (nums[mid] == target) {
                ans = mid;                  // ✅ mid store karo
                right = mid - 1;

            } else if (nums[mid] > target) {
                right = mid - 1;

            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    int findLast(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = (left + right) / 2;  // ✅ brackets

            if (nums[mid] == target) {
                ans = mid;                  // ✅ mid store karo
                left = mid + 1;

            } else if (nums[mid] > target) {
                right = mid - 1;

            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}