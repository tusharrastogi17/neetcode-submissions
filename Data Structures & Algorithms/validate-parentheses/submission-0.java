class Solution {

    // brute force
    public boolean isValid(String s) {
        while(s.contains("()") || s.contains("[]") || s.contains("{}")){
            s=s.replace("{}","")
            .replace("()", "")
            .replace("[]","");
        }

        System.out.println("As: "+ s);

        return s.isEmpty();
        
    }
}
