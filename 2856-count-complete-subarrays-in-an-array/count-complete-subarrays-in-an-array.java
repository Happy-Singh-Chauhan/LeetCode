class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int res=0;
        int right=0;
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        Set<Integer> set=new HashSet<>();
        for(int num:nums)set.add(num);
        int distinct=set.size();
        for(int l=0;l<n;l++){
            if(l > 0){
                int remove=nums[l-1];
                map.put(remove,map.get(remove)-1);
                if(map.get(remove) == 0)map.remove(remove);
            }
            while(right<n && map.size() < distinct){
                int add=nums[right];
                map.put(add,map.getOrDefault(add,0)+1);
                right++;
            }
            if(map.size() == distinct){
                res+=n-right+1;
            }
        }
        return res;
    }
}