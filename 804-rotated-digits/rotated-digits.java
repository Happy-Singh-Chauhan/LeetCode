class Solution {
    public boolean check(int n){
        String str=""+n;
        if(str.contains("3") || str.contains("4") || str.contains("7"))return false;
        if(str.contains("2") || str.contains("5") || str.contains("6") || str.contains("9"))return true;
        return false;
    }
    public int rotatedDigits(int n) {
        int cnt=0;
        for(int i=2;i<=n;i++){
            if(check(i))cnt++;
        }
        return cnt;
    }
}