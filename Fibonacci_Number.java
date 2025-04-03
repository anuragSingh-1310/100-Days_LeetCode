public class Fibonacci_Number {
    public int fib(int n) {
        int sum = 0;
        if(n == 0){
            sum = 0;
        }
        if (n >= 1 && n <= 30){
            if(n == 1){
                sum = 1;
            }else {
                int a = 0;
                int b = 1;

                for(int i = 2; i <= n; i++){
                    sum = a + b;
                    a = b;
                    b = sum;

                }
            }
        }
        return sum;
    }
}
