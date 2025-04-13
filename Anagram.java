import java.util.*;

public class Anagram {
    class Solution {
        // Function is to check whether two strings are anagram of each other or not.
        public static boolean areAnagrams(String s1, String s2) {
            if(s1.length() == s2.length()){
                int a1[] = new int[s1.length()];
                int a2[] = new int[s2.length()];

                for(int i = 0; i < s1.length(); i++){
                    a1[i] = s1.charAt(i);
                }

                Arrays.sort(a1);

                for(int i = 0; i < s2.length(); i++){
                    a2[i] = s2.charAt(i);
                }

                Arrays.sort(a2);

                return Arrays.equals(a1, a2);
            }else {
                return false;
            }
        }
    }
}
