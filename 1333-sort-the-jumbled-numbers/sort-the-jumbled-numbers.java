class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
       List<int[]> list=new ArrayList<>();

       for(int i=0;i<nums.length;i++){
        int place=1;
        int mappedValue=0;
        int number=nums[i];

        if(number == 0){
            list.add(new int[]{mapping[0],i});
            continue;
        }
        while(number != 0){
            mappedValue=place * mapping[number % 10]+mappedValue;
            place*=10;
            number/=10;
        }
        list.add(new int[]{mappedValue,i});
       } 
       Collections.sort(list,(a,b)->a[0]-b[0]);
       int[] ans=new int[nums.length];
       for(int i=0;i<list.size();i++){
        ans[i]=nums[list.get(i)[1]];
       }
       return ans;
    }
}