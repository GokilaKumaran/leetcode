class Solution {
    public double myPow(double x, int n) {
        long N = n;          // Convert to long
        if (N < 0) {
            x = 1 / x;
            N = -N;          // Safe negation
        }
        
        double result = 1.0;
        while (N > 0) {
            if ((N & 1) == 1) { // If odd
                result *= x;
            }
            x *= x;
            N >>= 1;           // Divide N by 2
        }
        return result;
    }
}

