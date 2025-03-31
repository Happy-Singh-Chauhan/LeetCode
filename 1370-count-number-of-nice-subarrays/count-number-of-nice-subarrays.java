class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int curr=0;
        int res=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(curr,1);
        for(int num:nums){
            curr+=num%2;
            res+=map.getOrDefault(curr-k,0);
            map.put(curr,map.getOrDefault(curr,0)+1);
        }
        return res;
    }
}