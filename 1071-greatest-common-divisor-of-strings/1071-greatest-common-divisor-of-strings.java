class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2+str1)){
            return "";
        }

        int len = leng(str1.length() , str2.length());
        return str1.substring(0,len);

        
    }
    private int leng(int a , int b){
            if(b == 0 ) return a;
            return leng(b,a%b);
        }
}