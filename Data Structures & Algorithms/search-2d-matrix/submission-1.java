class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int rl=0;
        int cl=matrix[0].length-1; 

        while(rl<matrix.length){
            if(matrix[rl][0]<=target && target<=matrix[rl][cl]){
                while(cl>=0){
                    if(matrix[rl][cl]==target){
                        return true;
                    }
                    cl--;
                } 
            }
            rl++;
        }

        System.out.println("lenght:" + matrix.length);
        return false;

    }
}
