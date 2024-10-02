class Solution {
    public int[] arrayRankTransform(int[] arr) {
        if(arr.length == 0){
            return new int[]{};
        }
        int[] ans=Arrays.copyOf(arr,arr.length);
        Arrays.sort(ans);
        Map<Integer,Integer> map=new HashMap<>();

        map.put(ans[0],1);
        for(int i=1;i<ans.length;i++){
            if(ans[i]>ans[i-1]){
                map.put(ans[i],map.get(ans[i-1])+1);
            }
            else{
                map.put(ans[i],map.get(ans[i]));
            }
        }
        int[] res=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            res[i]=map.get(arr[i]);
        }
        return res;
    }
}