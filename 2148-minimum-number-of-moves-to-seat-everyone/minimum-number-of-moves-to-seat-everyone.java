class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int ans=0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for(int i=0;i<=seats.length-1;i++){
            int sum=Math.abs(students[i]-seats[i]);
            
            ans+=sum;
        }
        return ans;
    }
}