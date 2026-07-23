class Solution {
    public void sortColors(int[] nums) {
   int low = 0;     // for 0
        int mid = 0;     // current element
        int high = nums.length - 1; // for 2

        while (mid <= high) {

            // अगर value 0 है
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            }

            // अगर value 1 है
            else if (nums[mid] == 1) {
                mid++;
            }

            // अगर value 2 है
            else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }
    }
