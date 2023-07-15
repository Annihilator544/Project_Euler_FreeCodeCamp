public class Problem_35_Circular_Primes {
    public static void main(String[] args){
        long begin = System.currentTimeMillis();
        int count = 0;
        for(int i = 2; i < 1000000; i++){
            if(isCircularPrime(i)){
                count++;
            }
        }
        System.out.println(count);
        long end = System.currentTimeMillis();
        System.out.println(end - begin + "ms");
    }
    static boolean isCircularPrime(int n){
        if(!isPrime(n)){
            return false;
        }
        String s = Integer.toString(n);
        for(int i = 0; i < s.length(); i++){
            if(!isPrime(Integer.parseInt(s.substring(i) + s.substring(0, i)))){
                return false;
            }
        }
        return true;
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
