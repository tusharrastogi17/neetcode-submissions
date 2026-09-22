class Solution {
    public int longestConsecutive(int[] nums) {
        int ansL=1;
        int ansC=1;
        Arrays.sort(nums);
        if(nums.length==0 || nums==null ){
            return 0;
        }
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] == nums[i+1]){
                continue;
            }
            if(nums[i]==(nums[i+1]-1)){
                ansC++;
            }else{
                ansL = Math.max(ansL, ansC);
                ansC=1;
            }
        }
        return Math.max(ansL, ansC);
    }
}
