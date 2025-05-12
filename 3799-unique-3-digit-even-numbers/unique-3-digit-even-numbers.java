class Solution {
    public int totalNumbers(int[] digits) {
        List<Integer> list=new ArrayList<>();
        int n=digits.length;
        for(int i=0;i<n;i++){
            if(digits[i] == 0)continue;
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(digits[k] % 2 != 0)continue;
                    if(i != j && j != k && k != i){
                        int num=(digits[i]*100)+(digits[j]*10)+digits[k];
                        if(!list.contains(num))list.add(num);
                    }
                }
            }
        }
        return list.size();
    }
}