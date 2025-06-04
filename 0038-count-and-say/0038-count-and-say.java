class Solution {
    public String countAndSay(int n) {
        String res = "1";
        for(int i=1;i<n;i++){
            String next = "";
            int c = 1;
            for(int j=1;j<res.length();j++){
                if(res.charAt(j) == res.charAt(j-1)){
                    c++;
                }
                else{
                    next += c + "" + res.charAt(j-1);
                    c = 1;
                }
            }
            next += c + "" + res.charAt(res.length() - 1);
            res = next;
        }
        return res;
    }
}