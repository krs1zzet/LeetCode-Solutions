import java.util.*;

class Solution {
    public int romanToInt(String s) {
        int total = 0;
        int prev = 0; // önceki rakamın değeri

        for (int i = s.length() - 1; i >= 0; i--) {
            int num = 0;
            switch (s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }

            // Eğer mevcut sayı, sağındaki (önceki iterasyondaki) sayıdan küçükse çıkar
            if (num < prev)
                total -= num;
            else
                total += num;

            prev = num; // sonraki adım için güncelle
        }

        return total;
    }
}
