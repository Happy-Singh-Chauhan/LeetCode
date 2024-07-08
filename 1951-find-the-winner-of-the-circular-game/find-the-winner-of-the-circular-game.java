class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(i);
        }
        int Current_Position=0;
        while(n>1){
            Current_Position=(Current_Position + (k-1))%n;
            list.remove(Current_Position);
            n--;
        }
        int ans=list.get(0);
        return ans;
    }
}