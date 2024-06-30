class Solution {
    public boolean isPalindrome(int x) {
        int r=0;
        int temp = x;
        while(x>0){
           int rem = x%10;
           r = (r*10)+rem;
           x/=10;
        }
        if(temp==r){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution obj = new Solution();
        System.out.print(obj.isPalindrome(n));
    }
}