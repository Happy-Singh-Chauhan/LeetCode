class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Set<Integer> set=new HashSet<>();
        Set<Integer> set1=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set1.contains(arr[i]))continue;
            set1.add(arr[i]);
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] == arr[i]){
                    count++;
                }
            }
            if(set.contains(count))return false;
            set.add(count);
        }
        return true;
    }
}