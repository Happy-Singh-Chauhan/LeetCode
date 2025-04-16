class Solution {
    public long countGood(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        long count=0;
        int left=0;
        for(int right=0;right<n;right++){
            k-=map.getOrDefault(nums[right],0);
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(k <= 0){
                map.put(nums[left],map.get(nums[left])-1);
                k+=map.get(nums[left++]);
            }
            count+=left;
        }
        return count;
    }
}