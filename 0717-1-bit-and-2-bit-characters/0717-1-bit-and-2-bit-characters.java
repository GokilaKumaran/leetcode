class Solution {
    public boolean isOneBitCharacter(int[] bits) {
      int i = 0;
        int n = bits.length;

        while (i < n - 1) {  // stop at the second last bit
            if (bits[i] == 1) {
                i += 2; // two-bit character: skip next bit as well
            } else {
                i += 1; // one-bit character: move one step
            }
        }

        // If we ended exactly at the last bit, it's a one-bit character
        return i == n - 1;  
    }
}