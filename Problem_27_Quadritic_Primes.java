public class Problem_27_Quadritic_Primes {
    public static void main(String[] args){
        long begin = System.currentTimeMillis();
        int max = 0;
        int maxA = 0;
        int maxB = 0;
        for(int a = -999; a < 1000; a++){
            for(int b = -1000; b <= 1000; b++){
                int n = 0;
                while(isPrime(n * n + a * n + b)){
                    n++;
                }
                if(n > max){
                    max = n;
                    maxA = a;
                    maxB = b;
                }
            }
        }
        System.out.println(maxA * maxB);
        long end = System.currentTimeMillis();
        System.out.println(end - begin + "ms");
    }
    static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        if(n == 2){
            return true;
        }
        if(n % 2 == 0){
            return false;
        }
        for(int i = 3; i <= Math.sqrt(n); i+=2){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
