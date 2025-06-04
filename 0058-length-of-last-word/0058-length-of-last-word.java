class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int c = 0;
        boolean f = false;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i) == ' '){
                if(f) break;
            }
            if(s.charAt(i)!=' '){
                f=true;
                c++;
            }
        } 
        return c;
    }
}