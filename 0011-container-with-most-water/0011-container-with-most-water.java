class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int ans=-1;
        while(i<j){
            int heigh=Math.min(height[i],height[j]);
            int width=j-i;
            int area=heigh*width;
            ans=Math.max(ans,area);
            if(height[i]<height[j]) i++;
            else j--;
        }
        return ans;
    }
}