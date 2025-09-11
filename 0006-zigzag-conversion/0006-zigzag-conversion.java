class Solution {
    public String convert(String s, int numRows) {
        if(s.length()<=numRows || numRows==1){
            return s;
        }
        String result = "";
        int j = 0;
        while(j<s.length()){
            result+=s.charAt(j);
            j+=2*numRows-2;
        }
        j=1;
        for(int i = 1; i<numRows-1; i++){
            while(j<s.length()){
                result+=s.charAt(j);
                j+=2*numRows-2-2*i;
                /*
                if(i==numRows-1 || i==0){
                    continue;
                }
                */
                if(j<s.length()){
                    result+=s.charAt(j);
                    j+=2*i;
                }
                
            }
            j=i+1;
        }
        while(j<s.length()){
            result+=s.charAt(j);
            j+=2*numRows-2;
        }
        return result;
    }
}
