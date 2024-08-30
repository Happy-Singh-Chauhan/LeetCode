class Solution {
     public int reverse(int num){
        if(num<10){
            return num;
        }
        int ans=0;
        while(num > 0){
            ans=(10*ans)+(num%10);
            num/=10;
        }
        return ans;
    }
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> list=new HashSet<>();
        for(int n : nums){
            list.add(n);
            list.add(reverse(n));
        }
        return list.size();
    }
}