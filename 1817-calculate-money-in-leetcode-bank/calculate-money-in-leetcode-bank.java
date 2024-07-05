class Solution {
    public int totalMoney(int n) {
        int sum=0;
        int week=n/7;
        int days=n%7;
        int start=0;
        for(int i=0;i<week;i++){
            start+=1;
            sum+=(7*(2*start+6))/2;
        }
        for(int j=0;j<days;j++){
            start+=1;
            sum+=start;
        }
        return sum;
    }
}