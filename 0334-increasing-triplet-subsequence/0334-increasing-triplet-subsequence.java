class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        /* Brute Force Approach
        int c = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]<nums[j]&& nums[j]<nums[k]){
                        c=1;
                    }
                }
            }
        }
        return c==1;*/
        int f = Integer.MAX_VALUE;
        int s = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]<=f) f=nums[i];
            else if(nums[i]<=s) s=nums[i];
            else return true;
        }
        return false;
    }
}