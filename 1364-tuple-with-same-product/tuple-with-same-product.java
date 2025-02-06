class Solution {
    public int tupleSameProduct(int[] nums) {
        int result=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int product=nums[i]*nums[j];
                result+=8*map.getOrDefault(product,0);
                map.put(product,map.getOrDefault(product,0)+1);
            }
        }
        return result;
    }
}