class Solution {
    public String largestNumber(int[] nums) {
      String[] strNums = new String[nums.length];
        for(int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }
        
        // Custom comparator: compare concatenated strings in both possible orders
        Arrays.sort(strNums, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                // Sort in descending order based on which concatenation is bigger
                return order2.compareTo(order1);
            }
        });
        
        // Edge case: if the largest number is "0", return "0"
        if(strNums[0].equals("0")) {
            return "0";
        }
        
        // Build the largest number by concatenation
        StringBuilder sb = new StringBuilder();
        for(String s : strNums) {
            sb.append(s);
        }
        
        return sb.toString();  
    }
}