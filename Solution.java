class Solution {

    public static int lengthOfLongestSubstring(String s) {
        int res = 0;
        int pLength = 0;

        for (int i = 0; i < s.length(); i++) {

            int indexInPattern = s.substring(i - pLength, i).indexOf(s.charAt(i));

            if (pLength-indexInPattern<0) {
                pLength++;
            } else {
                pLength = pLength - indexInPattern;
            }
            res = Math.max(res, pLength);
        }
        return res;

    }
}