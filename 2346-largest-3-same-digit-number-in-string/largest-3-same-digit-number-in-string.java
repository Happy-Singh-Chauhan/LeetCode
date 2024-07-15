class Solution {
    public String largestGoodInteger(String num) {
        int ans=999;
        
        while(ans>0){
            String ans1=String.valueOf(ans);
            if(num.contains(ans1)){
                return ans1;
            }
            else{
                ans-=111;
            }
        }
        if(num.contains("000")){
                return "000";
            }
        return "";
    }
}