class Solution {
    public int[] resultArray(int[] nums) {
        int[] result=new int[nums.length];
        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(arr1.get(arr1.size()-1)>arr2.get(arr2.size()-1)){
                arr1.add(nums[i]);
            }
            else{
                arr2.add(nums[i]);
            }
        }
        int a=0;
        for(int i=0;i<arr1.size();i++){
            result[a]=arr1.get(i);
            a++;
        }
        for(int j=0;j<arr2.size();j++){
            result[a]=arr2.get(j);
            a++;
        }
        return result;
    }
}