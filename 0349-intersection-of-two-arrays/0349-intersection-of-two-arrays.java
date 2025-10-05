class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
         Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int num : nums2) {
            set2.add(num);
        }

        // List to hold the intersection elements
        List<Integer> ans = new ArrayList<>();
        
        // 2. Find the intersection
        //    Iterate over the smaller set for efficiency (here we just use set1)
        for (int num : set1) {
            // Check if the unique element from set1 is also present in set2
            if (set2.contains(num)) {
                ans.add(num);
            }
        }

        // 3. Convert the List<Integer> back to the required int[]
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        
        return result;

    }
}