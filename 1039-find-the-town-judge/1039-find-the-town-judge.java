class Solution {
    public int findJudge(int n, int[][] trust) {
        int a[] = new int[n];
        for(int i=0;i<trust.length;i++){
            a[trust[i][0]-1] -= 1;
            a[trust[i][1]-1] += 1;
        }
        for(int i=0;i<n;i++){
            if(a[i] == n-1){
                return i+1;
            }
        }
        return -1;
    }
}