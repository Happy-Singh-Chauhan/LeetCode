class Solution {
    public int digits(int num){
        int sum=0;
        while(num > 0){
            sum+=num % 10;
            num/=10;
        }
        return sum;
    }
    public int maximumSum(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            int digitSum=digits(nums[i]);
            if(map.containsKey(digitSum)){
                ans=Math.max(ans,map.get(digitSum)+nums[i]);
                map.put(digitSum,Math.max(nums[i],map.get(digitSum)));
            }
            else{
            map.put(digitSum,nums[i]);
            }
        }
        return ans;
    }
}