class Solution {
    public int longestPalindrome(String[] words) {
        Map<String, Integer> count = new HashMap<>();
        int res = 0;
        for (String word : words) {
            String rev = new StringBuilder(word).reverse().toString();
            if (count.getOrDefault(rev, 0) > 0) {
                res += 4;
                count.put(rev, count.get(rev) - 1);
            } else {
                count.put(word, count.getOrDefault(word, 0) + 1);
            }
        }

        for (String key : count.keySet()) {
            if (key.charAt(0) == key.charAt(1) && count.get(key) > 0) {
                res+=2;
                break;
            }
        }
        return res;
    }
}
