import java.util.*;

class Solution {
    public int maxDiff(int num) {
        String s = Integer.toString(num);
        Set<Character> seen = new HashSet<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (char ch : s.toCharArray()) {
            if (seen.contains(ch)) continue;
            seen.add(ch);

            // Replace with '9' for maximum
            String maxStr = s.replace(ch, '9');
            max = Math.max(max, Integer.parseInt(maxStr));

            // Replace with '1' for first digit, '0' otherwise (to avoid leading zero)
            char replaceWith = (ch == s.charAt(0)) ? '1' : '0';
            // Skip if it would create a leading zero
            if (replaceWith == '0' && ch == s.charAt(0)) continue;

            String minStr = s.replace(ch, replaceWith);
            min = Math.min(min, Integer.parseInt(minStr));
        }

        return max - min;
    }
}
