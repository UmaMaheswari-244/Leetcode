class Solution {
public:
    int maximumUnits(vector<vector<int>>& boxTypes, int truckSize) {
        sort(boxTypes.begin(), boxTypes.end(), [](vector<int>& a, vector<int>& b) {
            return b[1] < a[1]; 
        });
        int totalUnits = 0;
        for (auto& box : boxTypes) {
            int boxCount = min(truckSize, box[0]); 
            totalUnits += boxCount * box[1]; 
            truckSize -= boxCount;

            if (truckSize == 0) break;
        }
        return totalUnits;
    }
};