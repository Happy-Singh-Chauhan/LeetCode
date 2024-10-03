class Solution {
    public int minSubarray(int[] nums, int p) {
        int total=0;
        for(int num:nums){
            total=(total+num)%p;
        }
        if(total % p == 0){
            return 0;
        }
        int rem=total;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int curr=0;
        int res=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            curr=(nums[i]+curr)%p;
            int target=(curr-rem+p)%p;
            if(map.containsKey(target)){
                res=Math.min(res,i-map.get(target));
            }
            map.put(curr,i);
        }
        return (res<nums.length)? res:-1;
    }
}