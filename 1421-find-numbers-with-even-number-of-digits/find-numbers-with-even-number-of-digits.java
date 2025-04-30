class Solution {
    public boolean evenDigits(int num){
        if(num < 10)return false;
        int k=0;
        while(num > 0){
            k++;
            num/=10;
        }
        return (k % 2 == 0)? true:false;
    }
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
            if(evenDigits(num))count++;
        }
        return count;
    }
}