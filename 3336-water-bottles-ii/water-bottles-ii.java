class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int FullBottles=0;
        int EmptyBottles=numBottles;
        int BottlesDrunk=numBottles;
        while(numExchange<=EmptyBottles){
            while(numExchange<=EmptyBottles){
                FullBottles++;
                EmptyBottles-=numExchange;
                numExchange++;
            }
            BottlesDrunk+=FullBottles;
            EmptyBottles+=FullBottles;
            FullBottles=0;
        }
        return BottlesDrunk;
    }
}