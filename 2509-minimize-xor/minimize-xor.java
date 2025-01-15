class Solution {
    public boolean isSet(int x,int bit){
        return (x & (1 << bit)) != 0;
    }
    public int setBit(int x,int bit){
        return x | (1 << bit);
    }
    public int unsetBit(int x,int bit){
        return x & ~(1 << bit);
    }
    public int minimizeXor(int num1, int num2) {
        int result=num1;
        int targetSetBitsCount=Integer.bitCount(num2);
        int setBitsCount=Integer.bitCount(result);
        int currentBit=0;

        while(setBitsCount < targetSetBitsCount){
            if(!isSet(result,currentBit)){
                result=setBit(result,currentBit);
                setBitsCount++;
            }
            currentBit++;
        }

        while(setBitsCount > targetSetBitsCount){
            if(isSet(result,currentBit)){
                result=unsetBit(result,currentBit);
                setBitsCount--;
            }
            currentBit++;
        }
        return result;
    }
}