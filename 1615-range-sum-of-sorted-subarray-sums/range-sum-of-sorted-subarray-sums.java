class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int prefix=0;
            for(int j=i;j<n;j++){
                prefix+=nums[j];
                list.add(prefix);
            }
        }
        int result=0;
        Collections.sort(list);
        for(int i=left-1;i<right;i++){
            result=(result+list.get(i)) % 1000000007;
        }
        return result;
    }
}