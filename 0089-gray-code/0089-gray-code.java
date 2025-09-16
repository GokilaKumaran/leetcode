class Solution {
    public List<Integer> grayCode(int n) {
          List<Integer> result = new ArrayList<>();
        int totalNumbers = 1 << n; // 2^n
        
        for (int i = 0; i < totalNumbers; i++) {
            int gray = i ^ (i >> 1);
            result.add(gray);
        }
        
        return result;
    }
}