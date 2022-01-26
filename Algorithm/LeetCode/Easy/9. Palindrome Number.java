class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
        int reverse = 0;
        while(num > 0){
            reverse = (reverse*10) + (num%10);
            num /= 10;
        }
        
        return x - reverse == 0 ? true : false;
    }
}
