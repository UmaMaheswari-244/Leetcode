class Solution {
    public String reverseVowels(String s) {
        char[] a = s.toCharArray();
        int i =0, j = a.length - 1;
        while(i<j){
            while(i<j && !isVowel(a[i])){
                i++;
            }
            while(i<j && !isVowel(a[j])){
                j--;
            }
            char t = a[i];
            a[i] = a[j];
            a[j] = t;
            i++;
            j--;
        }
        return new String(a);
    }
    public static boolean isVowel(char s){
        return s=='a' || s=='e' || s=='i' || s=='u' || s=='o' || s=='A' || s=='E' || s=='I' || s=='U' || s=='O';
    }
}