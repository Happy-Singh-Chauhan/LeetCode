class Solution {
    public void swap(char[] arr,int i,int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public String smallestNumber(String pattern) {
        int n=pattern.length();
        char[] arr=new char[n+1];
        for(int i=0;i<arr.length;i++){
            arr[i]=(((i+1) + "").charAt(0));
        }
        for(int i=0;i<n;i++){
            int j=i;
            while(j >= 0 && pattern.charAt(j) == 'D'){
                swap(arr,j,j+1);
                j--;
            }
        }
        return String.valueOf(arr);
    }
}