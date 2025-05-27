class Solution {
    public int differenceOfSums(int n, int m) {
        int totalSum=0;
        int divisibleSum=0;
        for(int i=1;i<=n;i++){
            totalSum+=i;
            if(i % m == 0)divisibleSum+=i;
        }
        int notDivisibleSum=totalSum-divisibleSum;
        return notDivisibleSum-divisibleSum;
    }
}