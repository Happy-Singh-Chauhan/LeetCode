class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count=0;
        long ans=0;
        int n=nums.length;
        int i=0;
        while(i < n){
            while(i < n && nums[i] == 0){
                count++;
                i++;
                if(i >= n)break;
            }
            ans+=((count)*(count+1))/2;
            i++;
            count=0;
        }
        if(count != 0)ans+=((count)*(count+1))/2;
        return ans;
    }
}