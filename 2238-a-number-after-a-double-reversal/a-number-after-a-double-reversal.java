class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num == 0)return true;
       int n=num%10;
       if(n == 0)return false;
       return true; 
    }
}