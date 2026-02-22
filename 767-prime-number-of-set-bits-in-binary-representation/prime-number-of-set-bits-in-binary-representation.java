class Solution {
    public boolean setPrime(int n,List<Integer> list){
        int set=0;
        while(n > 0){
            if((n&1) == 1)set++;
            n>>=1;
        }
        if(list.contains(set))return true;
        return false;
    }
    public int countPrimeSetBits(int left, int right) {
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(11);
        list.add(13);
        list.add(17);
        list.add(19);
        int count=0;
        for(int i=left;i<=right;i++){
            if(setPrime(i,list))count++;
        }
        return count;
    }
}