class Solution {
    public int maxGoodNumber(int[] nums) {
        String[] s=new String[3];
        for(int i=0;i<3;i++){
            s[i]=Integer.toBinaryString(nums[i]);
        }
        int ans=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i != j){
                    for(int k=0;k<3;k++){
                        if(k != i && k != j){
                            String x=s[i]+s[j]+s[k];
                            ans=Math.max(ans,Integer.parseInt(x,2));
                        }
                    }
                }
            }
        }
        return ans;
    }
}