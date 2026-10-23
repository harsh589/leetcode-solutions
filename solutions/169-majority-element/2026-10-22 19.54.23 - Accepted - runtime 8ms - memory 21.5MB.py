class Solution:
    def majorityElement(self, nums: list[int]) -> int:
        maxNo = 0
        count =0
        for num in nums:
            if count == 0:
                maxNo = num
            if num == maxNo:
                count += 1
            else:
                count -= 1
        return maxNo





