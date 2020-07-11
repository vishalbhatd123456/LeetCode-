class Solution {
    public int maxArea(int[] height) {
        
       int maxArea = 0;
        
        int l = 0;
        int h = height.length-1;
        
        while(l<h)
        {
            maxArea = Math.max(maxArea,Math.min(height[l],height[h])*(h-l));
            if(height[l]<height[h])
            {
                l++;
            }
            else
            {
                h--;
            }
        }
        return maxArea;
}
}
