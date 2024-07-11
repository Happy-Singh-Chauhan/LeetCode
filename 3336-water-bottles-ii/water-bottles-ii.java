class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int EmptyBottles=0;
        int BottleDrunk=0;
        int FullBottles=numBottles;
        while(FullBottles >= 0 && numExchange>EmptyBottles){
            if(numExchange>EmptyBottles){
                EmptyBottles+=FullBottles;
                BottleDrunk+=FullBottles;
                FullBottles=0;
            }
            while(numExchange<=EmptyBottles){
                FullBottles++;
                EmptyBottles-=numExchange;
                numExchange++;
            }
            if(FullBottles == 0 && numExchange > EmptyBottles){
                break;
            }
        }
        return BottleDrunk;
    }
}