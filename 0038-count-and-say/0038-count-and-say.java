class Solution {
    public String countAndSay(int n) {
        String out = "1 ";
        while(n > 1) {
            String rle = "";
            char com = out.charAt(0);
            int count = 0;
            for(char c : out.toCharArray()) {
                if(com == c) {
                    count++;
                } else {
                    rle += count+""+com;
                    com = c;
                    count = 1;
                }
            }
            out = rle + " ";
            n--;
        } 
        out = out.substring(0,out.length()-1);
        return out;
    }
}