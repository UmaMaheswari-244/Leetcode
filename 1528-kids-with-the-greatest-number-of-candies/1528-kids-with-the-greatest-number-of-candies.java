class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int m = 0;
        for(int i:candies){
            if(i>m){
                m = i;
            }
        }
        for(int i:candies){
            res.add(i + extraCandies >= m);
        }
        return res;
    }
}