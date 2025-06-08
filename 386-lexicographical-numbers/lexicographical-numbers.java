class Solution {
    public void lexicographicalNumber(int number,List<Integer> list,int n){
        if(number > n)return;
        list.add(number);
        for(int i=0;i<=9;i++){
            int num=number*10+i;
            if(num > n)return;
            lexicographicalNumber(num,list,n);
        }
        return;
    }
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=9;i++){
            lexicographicalNumber(i,list,n);
        }
        return list;
    }
}