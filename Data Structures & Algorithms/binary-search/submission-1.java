class Solution {
    //brute force
    public int search(int[] nums, int target) {
        
        int index=-1;
        int n= nums.length;
        int x = n/2;
        
        if(nums[x]==target){
            return x;
        }else if(nums[x]<target){
            while(x<n){
                if(nums[x]==target){
                    return x;
                }
                x++;
            }
        }else if(nums[x]>target){
            while(x>=0){
                if(nums[x]==target){
                    return x;
                }
                x--;
            }
        }

        System.out.println("x: "+ x);
        return index;

        
    }
}
