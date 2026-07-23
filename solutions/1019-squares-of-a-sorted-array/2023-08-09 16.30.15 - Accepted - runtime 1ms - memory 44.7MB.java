class Solution {
    public int[] sortedSquares(int[] nums) {
        int n =nums.length;

        for(int i =0;i<n;i++){
            nums[i]=nums[i]*nums[i];
        }

        int l =0;
        int r =n-1;
int[] ans = new int[nums.length];

for(int i = n-1;i>=0;i--){
if(nums[l]>=nums[r]){
    ans[i]=nums[l];
    l++;
}
else{
    ans[i]=nums[r];
    r--;
}

}
return ans;

    }
}