public class Problem_37_Truncatables_Primes {
    public static void main(String[] args){
        long begin = System.currentTimeMillis();
        int sum = 0;
        int count = 0;
        int i = 11;
        while(count < 11){
            if(isTruncatablePrime(i)){
                sum+=i;
                count++;
                System.out.println(i);
            }
            i+=2;
        }
        System.out.println(sum);
        long end = System.currentTimeMillis();
        System.out.println(end - begin + "ms");
    }
    static boolean isTruncatablePrime(int n){
        if(!isPrime(n)){
            return false;
        }
        String s = Integer.toString(n);
        for(int i = 1; i < s.length(); i++){
            if(!isPrime(Integer.parseInt(s.substring(i)))){
                return false;
            }
        }
        for(int i = s.length() - 1; i > 0; i--){
            if(!isPrime(Integer.parseInt(s.substring(0, i)))){
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
