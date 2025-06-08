class Solution {
    public void lexicographicalNumber(int i,List<Integer> list,int n){
        int num=i*10;
        if(num <= n){
            list.add(num);
            lexicographicalNumber(num,list,n);
        }
        else return;
        for(int j=1;j<=9;j++){
            int num1=num+j;
        if(num1 <= n){
            list.add(num1);
            lexicographicalNumber(num1,list,n);
        }
        else break;
        }
        return;
    }
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=9;i++){
            if(i <= n){
                list.add(i);
                lexicographicalNumber(i,list,n);
            }
        }
        return list;
    }
}