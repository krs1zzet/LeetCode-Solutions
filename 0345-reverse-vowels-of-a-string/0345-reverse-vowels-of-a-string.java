class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        int right = n - 1;
        char[] myArray = s.toCharArray();

        for (int left = 0; left < n; left++) {
            if (isVowel(myArray[left])) {
                while (!isVowel(myArray[right]) && right > left) {
                    right--;
                }
                if(left >= right){
                    break;
                }
                if(isVowel(myArray[right])){
                    char temp = myArray[left];
                    myArray[left] = myArray[right];
                    myArray[right] = temp;
                    right--;
                }
                
                

            }

        }

        return new String(myArray);

    }

    static Boolean isVowel(char a) {
        if (a == 'a' || a == 'A' || a == 'E' || a == 'e' || a == 'I' || a == 'i' || a == 'O' || a == 'o' || a == 'U'
                || a == 'u') {
            return true;
        } else {
            return false;
        }
    }
}