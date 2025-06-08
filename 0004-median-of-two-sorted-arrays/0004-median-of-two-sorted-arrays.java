class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0;
        int n = nums1.length, m = nums2.length;
        int[] r = new int[n + m];
        while (i < n && j < m) {
            if (nums1[i] < nums2[j]) {
                r[k++] = nums1[i++];
            } else {
                r[k++] = nums2[j++];
            }
        }
        while (i < n) r[k++] = nums1[i++];
        while (j < m) r[k++] = nums2[j++];
        int l = r.length;
        int mid = l / 2;
        if (l % 2 == 0) {
            return (r[mid - 1] + r[mid]) / 2.0; 
        } else {
            return r[mid];
        }
    }
}
