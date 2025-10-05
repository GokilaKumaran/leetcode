class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer>set1=new HashSet<>();
        for(int num:nums1){
            set1.add(num);
        }
        Set<Integer>set2=new HashSet<>();
        for(int num:nums2){
            set2.add(num);
        }
        List<List<Integer>> answer=new ArrayList<>();
        List<Integer>distinctnums1only= new ArrayList<>();
        for(int num:set1){
            if(!set2.contains(num)){
                distinctnums1only.add(num);
            }
        }
        List<Integer>distinctnums2only= new ArrayList<>();
        for(int num:set2){
            if(!set1.contains(num)){
                distinctnums2only.add(num);
            }
        }
        answer.add(distinctnums1only);
        answer.add(distinctnums2only);
        return answer;
    }
}