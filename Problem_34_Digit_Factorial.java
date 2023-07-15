public class Problem_34_Digit_Factorial {
    public static void main(String[] args){
        long begin = System.currentTimeMillis();
        int sum = 0;
        for(int i = 3; i < 10000000; i++){
            if(isDigitFactorial(i)){
                sum+=i;
            }
        }
        System.out.println(sum);
        long end = System.currentTimeMillis();
        System.out.println(end - begin + "ms");
    }
    static boolean isDigitFactorial(int n){
        int sum = 0;
        int temp = n;
        while(temp > 0){
            sum+=factorial(temp%10);
            temp/=10;
        }
        return sum == n;
    }
    static int factorial(int n){
        if(n == 0){
            return 1;
        }
        return n * factorial(n-1);
    }
}
