class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int empty=numBottles;
        int exchange=0;
        int total=empty;
        while(empty>=numExchange){
            exchange=empty/numExchange;
            total+=exchange;
            empty=empty%numExchange+exchange;
        }
        return total;
    }
}