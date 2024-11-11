class Solution {
    public boolean prime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public boolean primeSubOperation(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int bound=0;
            if(i == 0){
                bound=nums[0];
            }
            else{
                bound=nums[i]-nums[i-1];
            }
            if(bound <= 0){
                return false;
            }
            int p=0;
            for(int j=bound-1;j>=2;j--){
                if(prime(j)){
                    p=j;
                    break;
                }
            }
            nums[i]=nums[i]-p;
        }
        return true;
    }
}