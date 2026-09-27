class Solution {
    public int maxArea(int[] heights) {
        int l=heights[0];
        int count=0;
        int start=0, end=heights.length-1;
        int water=Integer.MIN_VALUE;
        while(start<end){
            int temp =(end-start)*Math.min(heights[start], heights[end]);
            water = Math.max(temp, water);
           
           if(heights[start]<heights[end]){
            start++;
           }else{
            end--;
           }
       }
       return water;
    }
}
