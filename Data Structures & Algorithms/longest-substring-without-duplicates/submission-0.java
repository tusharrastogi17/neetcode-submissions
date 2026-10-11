class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charMap = new HashMap<>();
        int maxLength=0;
        int l=0;

        for(int i=0; i<s.length();i++){
            char currChar = s.charAt(i);

            if(charMap.containsKey(currChar)){
                l =Math.max(l, charMap.get(currChar)+1);
            }

            charMap.put(currChar, i);

            maxLength = Math.max(maxLength, i-l+1);
        }

        return maxLength;
        
    }
}
