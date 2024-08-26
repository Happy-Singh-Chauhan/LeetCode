class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] arr=s.toCharArray();
        int start=0;
        int end=arr.length-1;
        
        while(arr[end] != '1'){
            if(arr[start] == '1'){
                arr[start]='0';
                arr[end]='1';
                break;
            }
            start++;
        }
        int ptr=0;
        for(int i=0;i<end;i++){
            if(arr[i]=='1'){
                arr[i]='0';
                arr[ptr]='1';
                ptr++;
            }
        }
        return String.valueOf(arr);
    }
}