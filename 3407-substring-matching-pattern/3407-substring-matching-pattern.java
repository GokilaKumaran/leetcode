class Solution {
    public boolean hasMatch(String s, String p) {
            int idx = p.indexOf("*");
        //System.out.println(idx);

        if(idx == 0){
            if(p.length() == 1) return true;
            return s.contains(p.substring(1));
        }

        String p1 = p.substring(0, idx);
        int a = s.indexOf(p1);
        //System.out.println(a);

        if(a == -1) return false;
        if(idx == p.length() - 1) return true;


        String p2 = p.substring(idx + 1);
        int b = s.lastIndexOf(p2);
        //System.out.println(b);
        if(b == -1) return false;

        if(a + p1.length() <= b) return true;
        
        return false;
           
    }
}