class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            list.add(nums1[i][0]);
            map.put(nums1[i][0],nums1[i][1]);
        }
        for(int i=0;i<nums2.length;i++){
            if(!list.contains(nums2[i][0])){
                list.add(nums2[i][0]);
                map.put(nums2[i][0],nums2[i][1]);
            }
            else{
                map.put(nums2[i][0],map.get(nums2[i][0])+nums2[i][1]);
            }
        }
        int[][] ans=new int[list.size()][2];
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            ans[i][0]=list.get(i);
            ans[i][1]=map.get(list.get(i));
        }
        return ans;
    }
}