class Solution {
    public boolean isSubsequence(String s, String t) {
        int tl = t.length();
        int sl = s.length();
        int index = 0;
        if(tl < 1 && sl < 1){
            return true;
        }
        if(tl<sl){
            return false;
        }
        if(sl<1){
            return true;
        }
        
        for(int i = 0 ; i < tl ; i++){
            if(s.charAt(index) == t.charAt(i)){
                index++;
                if(index == sl){
                return true;
            }
            }
            
        }
        return false;

    }
}