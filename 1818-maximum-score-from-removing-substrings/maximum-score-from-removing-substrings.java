class Solution {
    public int maximumGain(String s, int x, int y) {
        Stack<Character> stack=new Stack<>();
        int score=0;
        String first="";
        String second="";
        int val1=0;
        int val2=0;
        if(x < y){
            first+="ba";
            val1=y;
            val2=x;
            second+="ab"+x;
        }
        else{
            first+="ab"+x;
            second+="ba"+y;
            val1=x;
            val2=y;
        }
        for(char c:s.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == first.charAt(0) && c == first.charAt(1)){
                    score+=val1;
                    stack.pop();
                    continue;
            }
            stack.push(c);
        }
        String str="";
        while(!stack.isEmpty()){
            str+=stack.pop();
        }
        String str1=new StringBuilder(str).reverse().toString();
        for(char c:str1.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == second.charAt(0) && c == second.charAt(1)){
                score+=val2;
                stack.pop();
                continue;
            }
            stack.push(c);
        }
        return score;
    }
}