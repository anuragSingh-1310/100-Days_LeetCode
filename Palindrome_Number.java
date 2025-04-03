class Palindrome_Number {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }

        int n = x;

        int rNum = 0;

        while(n>0){
            int d = n%10;
            rNum = rNum*10 + d;
            n = n/10;
        }

        if(rNum == x){
            return true;
        }else{
            return false;
        }
    }
}