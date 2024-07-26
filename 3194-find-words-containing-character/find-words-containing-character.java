class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            char[] charArray=words[i].toCharArray();
            for(int j=0;j<charArray.length;j++){
                if(charArray[j] == x){
                    list.add(i);
                    break;
                }
            }
        }
        return list;
    }
}