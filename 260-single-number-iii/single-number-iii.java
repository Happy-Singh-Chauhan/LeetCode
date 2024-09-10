class Solution {
    public int[] singleNumber(int[] nums) {
        if(nums.length == 2){
            return new int[]{nums[0],nums[1]};
        }
        List<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length-1){
            if(nums[i] != nums[i+1]){
                list.add(nums[i]);
                i++;
            }
            else{
                i+=2;
            }
        }
        if(nums[nums.length-2] != nums[nums.length-1]){
            list.add(nums[nums.length-1]);
        }
        int[] arr=new int[list.size()];
        for(int j=0;j<list.size();j++){
            arr[j]=list.get(j);
        }
        return arr;
    }
}