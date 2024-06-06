class Solution {
    public int countDigits(int num) {
        
        int x=num;
        
        int count=0;
        
        
        while(x>0){
            int sum=0;
            sum+=x%10;
            if(num % sum == 0){
                count++;
            }
            x=x/10;
        }
        return count;
    }
}