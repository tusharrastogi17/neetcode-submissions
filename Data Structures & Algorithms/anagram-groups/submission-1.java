class Solution {

    private boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] arr = new int[26]; // For lowercase English letters ('a' through 'z')
        for (int k = 0; k < s1.length(); k++) {
            arr[s1.charAt(k) - 'a']++;
            arr[s2.charAt(k) - 'a']--;
        }

        for (int count : arr) {
            if (count != 0) return false;
        }
        return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> ans = new ArrayList<>();
        boolean visited [] = new boolean[strs.length];
        //Brute force try
        for(int i=0; i<strs.length; i++){
            if(visited[i]){
                continue;
            }
            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            visited[i]=true;
            for(int j=i+1; j<strs.length; j++){
                if(!visited[j] && isAnagram(strs[i], strs[j])){
                    group.add(strs[j]);
                    visited[j]=true;
                }
            }
        ans.add(group);
        }
        return ans;
    }
}
