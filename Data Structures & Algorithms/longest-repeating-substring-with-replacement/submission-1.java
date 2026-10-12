class Solution {
    public int characterReplacement(String s, int k) {

        int arr []= new int[26];
        int left=0;
        int rMax=0, lmax=0;
        int maxLength= 0;

        for(int r=0; r<s.length(); r++){
            arr[s.charAt(r)-'A']++;
            rMax = Math.max(rMax, arr[s.charAt(r)-'A'] );

            if((r-left+1)-rMax > k){
                arr[s.charAt(left)-'A']--;
                left++;
            }

            maxLength= Math.max(maxLength, r-left+1);

        }

        System.out.println("Arr: "+ Arrays.toString(arr));
        return maxLength;
    }
}
