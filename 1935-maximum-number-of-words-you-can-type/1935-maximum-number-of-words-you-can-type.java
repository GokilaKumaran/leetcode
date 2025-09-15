class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String arr[]=text.split(" ");
        int count=0;
        for(String word:arr){
            boolean cantype=true;
            for(char c: brokenLetters.toCharArray()){
                if(word.indexOf(c)!=-1){
                    cantype=false;
                    break;
                }
            }
            if(cantype) count++;

        }
        return count;
    }
}