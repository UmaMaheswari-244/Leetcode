class Solution {
    public boolean squareIsWhite(String coordinates) {
        char a = coordinates.charAt(0);
        int b = coordinates.charAt(1) - '0';
        if(a == 'a' || a == 'c' || a == 'e'|| a == 'g'){
            if(b%2==0){
                return true;
            }
        }
        else if(a == 'b'|| a == 'd' || a == 'f' || a =='h'){
            if(b%2==1){
                return true;
            }
        }
        return false;
    }
}