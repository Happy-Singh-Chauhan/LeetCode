class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            sb.append((int)(s.charAt(i)-96));
        }
        int sum=0;
        for(int i=0;i<sb.length();i++){
            sum+=((sb.charAt(i))-'0');
        }
        k--;
        while(k>0){
            int num=sum;
            sum=0;
            while(num>0){
                sum+=num%10;
                num/=10;
            }
            k--;
        }
        return sum;
    }
}