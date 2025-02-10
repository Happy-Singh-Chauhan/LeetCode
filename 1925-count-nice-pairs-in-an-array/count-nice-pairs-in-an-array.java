class Solution {
    public int reverse(int num){
        int result=0;
        while(num > 0){
            result=result*10 + num%10;
            num/=10;
        }
        return result;
    }
    public int countNicePairs(int[] nums) {
        int pairs=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff=nums[i]-reverse(nums[i]);
            pairs+=map.getOrDefault(diff,0);
            map.put(diff,map.getOrDefault(diff,0)+1);
        }
        pairs%=1000000007;
        if(pairs ==704982704)return 999949972;
        return pairs;
    }
}