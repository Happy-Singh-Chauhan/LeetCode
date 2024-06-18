class Solution {
    public int minOperations(int[] nums, int k) {
        int xor=0;
        for(int num : nums){
            xor^=num;
        }
        xor^=k;
        int count=0;
        while(xor>0){
            if((xor&1)!=0){
                count++;
            }
            xor =xor >> 1;
        }
        return count;
    }
}