class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits.length()==0) return res;
        String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        solve(digits, map, 0, res, new StringBuilder());
        return res;
    }
    public void solve(String digits, String[] map, int idx, List<String> res, StringBuilder comb){
        if(idx==digits.length()){
            res.add(comb.toString());
            return;
        }
        int num = digits.charAt(idx) - '0';
        String dig = map[num];
        for(int i=0;i<dig.length();i++){
            comb.append(dig.charAt(i));
            solve(digits, map, idx+1, res, comb);
            comb.deleteCharAt(comb.length()-1);
        }
    }
}