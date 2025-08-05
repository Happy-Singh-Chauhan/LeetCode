class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n=fruits.length;
        Set<Integer> set=new HashSet<>();
        int unPlaced=0;
        for(int i=0;i<n;i++){
            boolean picked=false;
            for(int j=0;j<n;j++){
                if(!set.contains(j) && fruits[i] <= baskets[j]){
                    set.add(j);
                    picked=true;
                    break;
                }
            }
            if(!picked)unPlaced++;
        }
        return unPlaced;
    }
}