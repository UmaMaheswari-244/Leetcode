class Solution {
    public int minimumPushes(String word) {
        int hash[] = new int[26];
        for(int i=0;i<word.length();i++){
            hash[word.charAt(i)-'a']++;
        }
        int a = 0;
        Arrays.sort(hash);
        for(int i=0;i<26;i++){
            a += (i/8 + 1) * hash[26-i-1];
        }
        return a;
    }
}