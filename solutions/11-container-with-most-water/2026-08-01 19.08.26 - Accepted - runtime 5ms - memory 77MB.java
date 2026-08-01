class Solution {
    public int maxArea(int[] height) {
        
        int left = 0;
        int right=height.length-1;
        int maxArea=0;

        while(left<right){
            int width = right-left;
            int h  =Math.min(height[left] , height[right]);

            int area  = width *h;

            maxArea = Math.max(area,maxArea);


            if(height[right]<height[left]){
                right--;
            }
            else{
                left++;
            }
        }

return maxArea;

    }
}