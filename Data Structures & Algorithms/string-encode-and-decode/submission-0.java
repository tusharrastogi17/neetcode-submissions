class Solution {

    public String encode(List<String> strs) {
        StringBuilder encode = new StringBuilder();
        for(String s: strs){
            encode.append(s.length()).append('#').append(s);
        }
        System.out.println("encode: "+ encode);
        return encode.toString();
    }

    public List<String> decode(String str) {
        List<String> res= new ArrayList<>();
        int i=0; 

        while(i< str.length()){
            int j=i;
            while(str.charAt(j)!='#'){
                j++;
            }

            int length = Integer.parseInt(str.substring(i,j));
            System.out.println("j: "+ j);
            System.out.println("i: "+ i);
            System.out.println("length: "+ length);
            int start =j+1;
            int end = start+ length;
            res.add(str.substring(start,end));

            i=end;
        }
        return res;
    }
}
