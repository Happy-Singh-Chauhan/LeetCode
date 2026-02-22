class Solution {
    public int binaryGap(int n) {
        String s=Integer.toBinaryString(n);
        int l=s.length();
        int max=0;
        int i=0;
        for(int j=1;j<l;j++){
            if(s.charAt(j) == '0')continue;
            else{
                max=Math.max(max,j-i);
                i=j;
            }
        }
        return max;
    }
}