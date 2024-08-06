class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Boolean> m = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(m.get(arr[i])!=null){
                m.put(arr[i],false);
            }
            else{
                m.put(arr[i],true);
            }
        }
        for(int i=0;i<arr.length;i++){
            if(m.get(arr[i])){
                k--;
                if(k==0){
                    return arr[i];
                }
            }
        }
        return "";
    }
}