class Solution {
    public String smallestNumber(String pattern) {
        Stack<Integer> stack=new Stack<>();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<=pattern.length();i++){
            stack.push(i+1);
            if(i == pattern.length() || pattern.charAt(i) == 'I'){
                while(!stack.isEmpty()){
                    sb.append(stack.pop());
                }
            }
        }
        return sb.toString();
    }
}