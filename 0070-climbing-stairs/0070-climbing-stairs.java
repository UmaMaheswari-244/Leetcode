class Solution {
    int t[] = new int[46];
    public int solve(int n){
        if(n<0) return 0;
        if(n==0) return 1;
        if(t[n] != -1) return t[n];
        int os = solve(n-1);
        int ts = solve(n-2);
        return t[n] = os + ts;
    }
    public int climbStairs(int n) {
        Arrays.fill(t, -1);
        return solve(n);
    }
}