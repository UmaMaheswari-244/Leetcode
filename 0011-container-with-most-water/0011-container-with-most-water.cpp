class Solution {
public:
    int maxArea(vector<int>& height) {
        int ma = 0;
        int l = 0;
        int r = height.size() - 1;
        while(l<r){
            ma = max(ma, (r-l)* min(height[l], height[r]));
            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return ma;
    }
};