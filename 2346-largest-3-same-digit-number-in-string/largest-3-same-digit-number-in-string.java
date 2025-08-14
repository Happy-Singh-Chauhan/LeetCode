class Solution {
    public String largestGoodInteger(String num) {
        int n=999;
        while(n > 0){
            String s=""+n;
            if(num.contains(s))return s;
            n-=111;
        }
        if(num.contains("000"))return "000";
        return "";
    }
}