class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int i=0;
        int j=0;
        int k=0;
        int[] arr=new int[m+n];
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                arr[k]=nums1[i];
                i++;
            }
            else{
                arr[k]=nums2[j];
                j++;
            }
            k++;
        }
        while(i<m){
            arr[k]=nums1[i];
            i++;
            k++;
        }
        while(j<n){
            arr[k]=nums2[j];
            j++;
            k++;
        }
        double ans=0;
        int t=arr.length;
        if(t % 2 !=0){
            ans=arr[t/2];
            return ans;
        }
        else{
           int s=0;
           int e=t-1;
           int mid=(s+e)/2;
           ans=(double)(arr[mid]+arr[mid+1])/2;
            return ans;
        }
    }
}