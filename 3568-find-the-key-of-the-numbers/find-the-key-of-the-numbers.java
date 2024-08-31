class Solution {
    public String argument(int n){
        String s=n+"";
        while(s.length() < 4){
            s='0'+s;
        }
        return s;
    }
    public int generateKey(int num1, int num2, int num3) {
        String s1=argument(num1);
        String s2=argument(num2);
        String s3=argument(num3);
        String[] arr={s1,s2,s3};

        String res="";
        for(int i=0;i<4;i++){
            int result=10;
            int val;
            for(String str : arr){
                val=str.charAt(i)-'0';
                result=Math.min(val,result);
            }
            res+=result;
        }
        return Integer.parseInt(res);
    }
}