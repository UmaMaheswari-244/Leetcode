class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i<n;i++){
            nums1[m+i] = nums2[i];
        }
        for(int i=0;i<nums1.length-1;i++){
            for(int j=0;j<nums1.length-i-1;j++){
                if(nums1[j] > nums1[j+1]){
                    int t = nums1[j];
                    nums1[j] = nums1[j+1];
                    nums1[j+1] = t;
                }
            }
        }
    }
}