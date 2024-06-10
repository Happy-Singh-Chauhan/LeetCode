class Solution {
    public int maximumCount(int[] nums) {
        int pos = 0;
        int neg = 0;
        for(int i : nums){
            if(i >0){
                pos++;
            }
            else if (i < 0){
                neg++;
            }
        }
        int max=Integer.max(pos,neg);
        return max;
        
    }
}