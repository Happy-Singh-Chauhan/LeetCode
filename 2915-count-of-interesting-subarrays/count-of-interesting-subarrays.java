class Solution {
    public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
        int n=nums.size();
        long res=0;
        int prefix=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++){
            prefix+=(nums.get(i) % modulo == k)? 1:0;
            res+=map.getOrDefault((prefix - k + modulo) % modulo,0);
            map.put(prefix % modulo,map.getOrDefault(prefix % modulo,0)+1);
        }
        return res;
    }
}