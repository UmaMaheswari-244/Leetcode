class Solution {
    public List<Integer> spiralOrder(int[][] m) {
        List<Integer> res = new ArrayList<>();
        int t=0, b=m.length-1;
        int l=0, r=m[0].length-1;
        while(t<=b && l<=r){
            for(int i=l;i<=r;i++){
                res.add(m[t][i]);
            }
            t++;
            for(int i=t;i<=b;i++){
                res.add(m[i][r]);
            }
            r--;
            if(t<=b){
                for(int i=r;i>=l;i--){
                    res.add(m[b][i]);
                }
                b--;
            }
            if(l<=r){
                for(int i=b;i>=t;i--){
                    res.add(m[i][l]);
                }
                l++;
            }
        }
        return res;
    }
}