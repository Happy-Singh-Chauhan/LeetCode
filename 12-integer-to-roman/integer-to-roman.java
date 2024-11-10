class Solution {
    public String intToRoman(int num) {
        int[] number={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roman={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<number.length;i++){
            while(num>=number[i]){
                sb.append(roman[i]);
                num-=number[i];
            }
        }
        return sb.toString();
    }
}