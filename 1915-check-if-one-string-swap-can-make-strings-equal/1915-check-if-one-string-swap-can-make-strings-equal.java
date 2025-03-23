class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int i=-1, j=-1;
        int c = 0;
        for(int k=0;k<s1.length();k++){
            if(s1.charAt(k) != s2.charAt(k)){
                c++;
                if(i==-1) i = k;
                else if(j==-1) j=k;
            }
        }
        if(c==0) return true;
        else if(c==2 && s1.charAt(i)==s2.charAt(j) && s1.charAt(j)==s2.charAt(i)) return true;
        return false;
    }
}