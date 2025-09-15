class Solution {
    public String countAndSay(int n) {
        if (n == 1) return "1";

        String prev = countAndSay(n - 1);  // Recursive call to get previous term
        StringBuilder result = new StringBuilder();

        int count = 1;
        for (int i = 0; i < prev.length(); i++) {
            // If next character is same, increment count
            if (i + 1 < prev.length() && prev.charAt(i) == prev.charAt(i + 1)) {
                count++;
            } else {
                // Else, append count and digit to result, reset count
                result.append(count).append(prev.charAt(i));
                count = 1;
            }
        }

        return result.toString();
    }
}