class Solution {
    public String mergeAlternately(String word1, String word2) {
         StringBuilder merged = new StringBuilder();
        int i = 0, j = 0;
        
        // Loop until one string is fully processed
        while (i < word1.length() && j < word2.length()) {
            merged.append(word1.charAt(i++));
            merged.append(word2.charAt(j++));
        }
        
        // Append remaining chars from word1, if any
        while (i < word1.length()) {
            merged.append(word1.charAt(i++));
        }
        
        // Append remaining chars from word2, if any
        while (j < word2.length()) {
            merged.append(word2.charAt(j++));
        }
        
        return merged.toString();
    }
}