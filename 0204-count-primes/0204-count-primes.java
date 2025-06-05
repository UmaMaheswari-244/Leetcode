class Solution {
    public int countPrimes(int n) {
        if(n<=1) return 0;
        boolean isPrime[] = new boolean[n];
        for(int i=0;i<n;i++){
            isPrime[i] = true;
        }
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i=2;i*i<n;i++){
            if(isPrime[i]){
                for(int j=i*i;j<n;j+=i){
                    isPrime[j] = false;
                }
            }
        }
        int c = 0;
        for(int i=0;i<n;i++){
            if(isPrime[i]){
                c++;
            }
        }
        return c;
    }
}