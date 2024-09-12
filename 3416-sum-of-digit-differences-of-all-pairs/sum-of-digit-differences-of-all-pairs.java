class Solution {
    public long sumDigitDifferences(int[] nums) {
        long res=0;
        int n=nums.length;
        int d=(nums[0]+"").length();

        for(int j=0;j<d;j++){
            int[] c=new int[10];

            for(int i=0;i<n;i++){
                int curr=(nums[i]+"").charAt(j)-'0';

                c[curr]++;
                res+=(i-c[curr]+1);
            }
        }
        return res;
    }
}