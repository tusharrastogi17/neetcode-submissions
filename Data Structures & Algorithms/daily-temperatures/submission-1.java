class Solution {
    //brute force 
    public int[] dailyTemperatures(int[] temperatures) {
        
        int arr[] = new int[temperatures.length];

        for(int i=0; i<arr.length; i++){
            int temp=temperatures[i];
            int j=i, k=0;
            while(j<arr.length){
                if(temperatures[j]>temp){
                    temp=temperatures[j];
                    k=j-i;
                    break;
                }
                j++;
            }
            arr[i]= k;
        }
        
        return arr;
    }
}
