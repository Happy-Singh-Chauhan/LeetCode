class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int count=0;
        int ans=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i) == 'L'){
                ans--;
            }
            else if(moves.charAt(i) == 'R'){
                ans++;
            }
            else{
                count++;
            }
        }
        return Math.abs(ans)+count;
    }
}