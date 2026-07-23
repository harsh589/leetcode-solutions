class Solution {
    public int maxArea(int[] height) {
        int start =0;
        int result =0;

        int end = height.length-1;
        while(start<end){
            int lh = height[start];
            int rh = height[end];

            int min = Math.min(lh,rh);

            int len = end - start;

            int area = min*len;

              result = Math.max(area,result);

            if(lh<rh)
                start++;
            
            else
                end--;
            
 
        }
       return result;
        
    }
    
}