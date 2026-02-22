class Solution {
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
            if(list.contains(Integer.bitCount(i)))count++;
        }
        return count;
    }
}