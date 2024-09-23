class Solution {
   Set<String> dic;
   Map<Integer, Integer> mem;
   public int minExtraChar(String s, String[] dictionary) {
       dic = new HashSet<>();
       mem = new HashMap<>();
       for (String d: dictionary) dic.add(d);
       return dp(s, 0);
   }

   public int dp(String s, int ind) {
       if (ind>=s.length()) return 0;
       if (mem.containsKey(ind)) return mem.get(ind);
       int extra = Integer.MAX_VALUE;
       String curS = "";
       for (int i=ind;i<s.length();i++) {
           curS+=s.charAt(i);
           if (dic.contains(curS)) {
               extra = Math.min(extra, dp(s, i+1));
           }
       }
       extra = Math.min(extra, 1+dp(s, ind+1));
       mem.put(ind, extra);
       return extra;
   }
}