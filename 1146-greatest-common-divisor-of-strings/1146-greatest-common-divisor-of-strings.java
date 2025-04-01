class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int l1 = str1.length();
        int l2 = str2.length();
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        int k = gcd(l1,l2);
        return str1.substring(0,k);
    }
    public int gcd(int l1, int l2){
        if(l2 == 0) return l1;
        return (gcd(l2,l1%l2));
    }
}