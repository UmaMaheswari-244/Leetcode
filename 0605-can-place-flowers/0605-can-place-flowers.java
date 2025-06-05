class Solution {
    public boolean canPlaceFlowers(int[] fb, int n) {
        if(n==0) return true;
        if(fb.length ==1 && fb[0] == 0 && n==1) return true;
        int c = 0;
        for(int i=0;i<fb.length-1;i++){
            if(i==0 && fb[i]==0 && fb[i+1]==0){
                fb[i] = 1;
                c++;
            }
            else if(i==fb.length-2 && fb[i+1]==0 && fb[i]==0){
                fb[i] = 1;
                c++;
            }
            else if(i!=0 && fb[i-1]!=1 && fb[i+1]!=1 && fb[i]==0){
                fb[i] = 1;
                c++;
            }
            if(c>=n) return true;
        }
        return false;
    }
}