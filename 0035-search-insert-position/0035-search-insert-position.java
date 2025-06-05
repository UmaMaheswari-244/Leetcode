class Solution {
    public int searchInsert(int[] a, int target) {
        int n = a.length;
        int l = 0;
        int h = n-1;
        //if(target>a[h]) return h;
        while(l<=h){
            int mid = (l+h)/2;
            if(a[mid]==target) return mid;
            if(a[mid]<target) l = mid+1;
            else if(a[mid]>target) h = mid-1;
            
        }
        return l;
    }
}