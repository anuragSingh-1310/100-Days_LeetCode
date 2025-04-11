public class Implement_Atoi {
    public int myAtoi(String s) {
        s = s.trim();

        int sign = 1;
        int i = 0;

        if(s.length() > 0 && s.charAt(i) == '-'){
            sign = -1;
            i++;
        }else if(s.length() > 0 && s.charAt(i) == '+'){
            i++;
        }

        int result = 0;
        while(i < s.length() && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';

            if(result > (Integer.MAX_VALUE - digit)/10){
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result*10 + digit;
            i++;
        }

        result *= sign;

        return result;
    }
}
