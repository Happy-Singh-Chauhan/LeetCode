class Solution {
    public List<String> getNeighbors(String word,Set<String> wordSet){
        List<String> neighbor=new ArrayList<>();
        char[] wordChar=word.toCharArray();

        for(int i=0;i<wordChar.length;i++){
            char originalChar=wordChar[i];
            for(char c='a';c<='z';c++){
                if(c == originalChar)continue;
                wordChar[i]=c;
                String transformedWord=new String(wordChar);
                if(wordSet.contains(transformedWord)){
                    neighbor.add(transformedWord);
                }
            }
            wordChar[i]=originalChar;
        }
        return neighbor;
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet=new HashSet<>(wordList);
        if(!wordSet.contains(endWord)) return 0;
        Queue<String> queue=new LinkedList<>();
        queue.offer(beginWord);
        Set<String> visited=new HashSet<>();
        visited.add(beginWord);

        int length=1;

        while(!queue.isEmpty()){
            int levelSize=queue.size();
            for(int i=0;i<levelSize;i++){
                String currentWord=queue.poll();
                if(currentWord.equals(endWord)) return length;
                for(String neighbor: getNeighbors(currentWord,wordSet)){
                    if(!visited.contains(neighbor)){
                        visited.add(neighbor);
                        queue.offer(neighbor);
                    }
                } 
            }
            length++;
        }
        return 0;
    }
}