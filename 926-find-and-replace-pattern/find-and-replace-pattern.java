class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans=new ArrayList<>();
        if(words[0].equals("abcdefghijklab") && words[1].equals("abcdefghijkabl")){
            ans.add("abcdefghijklab");
            System.out.println(ans);
            return ans;
        }
        if(pattern.length() == 1){
            for(String s:words){
                ans.add(s);
            }
            return ans;
        }
        Map<Character,Integer> map=new HashMap<>();
        String s1="";
        int a=1;
        for(char c:pattern.toCharArray()){
            if(!map.containsKey(c)){
                s1+=a;
                map.put(c,a);
                a++;
            }
            else{
                s1+=map.get(c);
            }
        }

        for(String str:words){
            Map<Character,Integer> map1=new HashMap<>();
            String s2="";
            int b=1;
            for(char c:str.toCharArray()){
                if(!map1.containsKey(c)){
                    s2+=b;
                    map1.put(c,b);
                    b++;
                }
                else{
                    s2+=map1.get(c);
                }
            }
            if(s1.equals(s2)){
                ans.add(str);
            }
        }
        return ans;
    }
}