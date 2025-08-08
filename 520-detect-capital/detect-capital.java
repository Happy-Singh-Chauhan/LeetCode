class Solution {
    public boolean check2(String word) {
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) < 'a' || word.charAt(i) > 'z')
                return false;
        }
        return true;
    }

    public boolean check1(String word) {
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) < 'A' || word.charAt(i) > 'Z')
                return false;
        }
        return true;
    }

    public boolean detectCapitalUse(String word) {
        char first = word.charAt(0);
        boolean cap = false;
        if (first >= 'A' && first <= 'Z')
            cap = true;
        boolean checkCap = check1(word);
        boolean checkSmall = check2(word);
        if (cap && checkCap || checkSmall)
            return true;
        if (!cap && checkSmall)
            return true;
        return false;
    }
}