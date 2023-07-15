public class Problem_33_Digit_Cancelling_Fractions {
    public static void main(String[] args){
        long begin = System.currentTimeMillis();
        int numerator = 1;
        int denominator = 1;
        for(int i = 10; i < 100; i++){
            for(int j = 10; j < 100; j++){
                if(i < j){
                    if(isDigitCancelling(i, j)){
                        numerator*=i;
                        denominator*=j;
                    }
                }
            }
        }
        System.out.println(denominator/gcd(numerator, denominator));
        long end = System.currentTimeMillis();
        System.out.println(end - begin + "ms");
    }
    static boolean isDigitCancelling(int i, int j){
        int numerator = i;
        int denominator = j;
        if(i%10 == 0 && j%10 == 0){
            return false;
        }
        if(i%10 == j%10){
            numerator/=10;
            denominator/=10;
        }
        else if(i%10 == j/10){
            numerator/=10;
            denominator%=10;
        }
        else if(i/10 == j%10){
            numerator%=10;
            denominator/=10;
        }
        else if(i/10 == j/10){
            numerator%=10;
            denominator%=10;
        }
        else{
            return false;
        }
        return (double)i/j == (double)numerator/denominator;
    }
    static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }    

}
