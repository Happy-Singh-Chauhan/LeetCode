class Solution {
    public long repairCars(int[] ranks, int cars) {
      long low=1;
      long high=1L*ranks[0]*cars*cars;
      while(low < high){
        long mid=(low + high)/2;
        long carRepaired=0;
        for(int rank:ranks){
            carRepaired+=(long)(Math.sqrt(1.0*mid/rank));
        }
        if(carRepaired < cars)low=mid+1;
        else high=mid;
      }
      return low;
    }
}