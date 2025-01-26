class Solution {
    public String findDifferentBinaryString(String[] nums) {
        List<String> list=new ArrayList<>();
        for(String s:nums){
            list.add(s);
        }
        int n=nums[0].length();
        int max=(int)(Math.pow(2,n)-1);
        for(int i=max;i>=0;i--){
            String s=Integer.toBinaryString(i);
            if(!list.contains(s)){
                if(s.length() == n){
                return s;
                }
                else{
                    for(int j=s.length();j<n;j++){
                        s="0"+s;
                    }
                    return s;
                }
            }
        }
        String ans="";
        return ans;
    }
}