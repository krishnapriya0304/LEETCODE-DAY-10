class Solution {
    public int maxArea(int[] height) {
        int maxArea=0,area=0;
        int right=0,left=height.length-1;
        while(right<left){
            area = Math.min(height[left], height[right])*(left - right);
            if(area>maxArea){
                maxArea=area;
            }
            if(height[right] < height[left]){
                right++;
            }
            else{
                left--;
            }
        }
        return maxArea;
    }
}
