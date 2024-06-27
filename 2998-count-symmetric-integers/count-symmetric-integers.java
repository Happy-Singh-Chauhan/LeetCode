class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int result=0;
        for(int i=low;i<=high;i++){
            List<Integer> list=new ArrayList<>();
            int value=i;
            while(value>0){
                list.add(value % 10);
                value/=10;
            }
            if(list.size() % 2 != 0){
                continue;
            }
            int sum1=0;
            int sum2=0;
            for(int j=0;j<list.size()/2;j++){
                sum1+=list.get(j);
            }
            for(int k=list.size()/2;k<list.size();k++){
                sum2+=list.get(k);
            }
            if(sum1 == sum2){
                result++;
            }
        }
        return result;
    }
}