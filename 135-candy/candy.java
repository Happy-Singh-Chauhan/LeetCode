class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        arr1[0]=1;
        for(int i=1;i<n;i++){
            if(ratings[i] < ratings[i-1]){
                arr1[i]=1;
               if(arr1[i-1] == 1)arr1[i-1]=arr1[i]+1; 
            }
            else if(ratings[i] == ratings[i-1])arr1[i]=1;
            else arr1[i]=arr1[i-1]+1;
        }
        arr2[n-1]=1;
        for(int i=n-2;i>=0;i--){
            if(ratings[i] < ratings[i+1]){
                arr2[i]=1;
                if(arr2[i+1] == 1)arr2[i+1]=arr2[i]+1;
            }
            else if(ratings[i] == ratings[i+1])arr2[i]=1;
            else arr2[i]=arr2[i+1]+1;
        }
        int count=0;
        for(int i=0;i<n;i++){
            count+=Math.max(arr1[i],arr2[i]);
        }
        return count;
    }
}