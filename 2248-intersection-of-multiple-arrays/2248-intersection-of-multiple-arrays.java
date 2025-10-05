class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer>list=new ArrayList<>();
        Map<Integer,Integer>map=new HashMap<>();
        int row=nums.length;
        for(int i=0;i<row;i++){
            for(int j=0;j<nums[i].length;j++){
                int val=nums[i][j];
                map.put(val,map.getOrDefault(val,0)+1);
            }
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            int key=entry.getKey();
            int val=entry.getValue();
            if(val==row){
                list.add(key);
            }
        }
        Collections.sort(list);
        return list;
    }
}