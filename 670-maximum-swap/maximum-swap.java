class Solution {
    public int reverse(int num){
        int m=num;
        int ans1=0;
        while(m > 0){
            ans1=(10*ans1)+(m%10);
            m/=10;
        }
        return Math.max(num,ans1);
    }
    public int maximumSwap(int num) {
        if(num < 12){
            return num;
        }
        if(num < 100){
            return reverse(num);
        }
        int n=num;
        int count=0;
        while(num > 0){
            num/=10;
            count++;
        }
        int count1=count;
        int[] arr=new int[count];
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(n / Math.pow(10,count-1));
            n%=Math.pow(10,count-1);
            count--;
        }
        for(int i=0;i<arr.length;i++){
            int max=0;
            int k=0;
            if(arr[i] == 9){
                continue;
            }
            for(int j=arr.length-1;j>i;j--){
                if(max < arr[j]){
                    max=arr[j];
                    k=j;
                }
            }
            if(max > arr[i]){
                int temp=arr[i];
                arr[i]=arr[k];
                arr[k]=temp;
                break;
            }
        }
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans+=arr[i]*Math.pow(10,count1-1);
            count1--;
        }
        return ans;
    }
}