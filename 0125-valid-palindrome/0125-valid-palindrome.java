class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        if(s.isEmpty()) return true;
        while(i<=j){
            char c = s.charAt(i);
            char l = s.charAt(j);
            if(!Character.isLetterOrDigit(s.charAt(i))) i++;
            else if(!Character.isLetterOrDigit(s.charAt(j))) j--;
            else{
                if(Character.toLowerCase(c) != Character.toLowerCase(l)) return false;
                i++;
                j--;
            }
        }
        return true;
    }
}