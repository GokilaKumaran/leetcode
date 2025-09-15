class Solution {
    public String[] findWords(String[] words) {
         
        List<String> result = new LinkedList<>();

        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        for (String str : words) {

            if (isContain(str, row1) || isContain(str, row2) || isContain(str, row3))
                result.add(str);
        }

        String[] array = result.toArray(new String[0]);
        return array;
    }
    public boolean isContain(String str, String row) {

        for (char c : str.toLowerCase().toCharArray()) {
            if (row.indexOf(c) == -1)
                return false;
        }
        return true; 
    }
}