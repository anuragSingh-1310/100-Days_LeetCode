public class Non_Repeating_Character {
    static char nonRepeatingChar(String s) {
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(s.indexOf(ch) == s.lastIndexOf(ch)){
                return ch;
            }
        }

        return '$';
    }
}
