class Solution {
    public int[] applyOperations(int[] nums) {
        int r[] = new int[nums.length];
        int c = 0;
        int i = 0;
        for(i = 0;i<nums.length-1;i++){
            if(nums[i]!=0){
                if(nums[i] == nums[i+1]){
                    r[c] = nums[i]*2;
                    i++;
                }
                else{
                    r[c] = nums[i];
                }
                c++;
            }
        }
        if(i!=nums.length){
            r[c] = nums[nums.length-1];
        }
        return r;
    }
}