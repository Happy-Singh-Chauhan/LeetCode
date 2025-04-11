class Solution {
    public int countSymmetricIntegers(int low, int high) {
       int result=0;
       for(int i=low;i<=high;i++){
        String s=String.valueOf(i);
        if(s.length() % 2 == 1)continue;
        int sum=0;
        for(int j=0;j<s.length()/2;j++){
            sum+=s.charAt(j);
        }
        for(int j=s.length()/2;j<s.length();j++){
            sum-=s.charAt(j);
        }
        if(sum == 0)result++;
       } 
       return result;
    }
}