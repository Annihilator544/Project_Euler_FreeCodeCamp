public class Problem_46_Goldbach_Other_Conjecture {
    public static void main(String[] args){
        long begin = System.currentTimeMillis();
        int n = 3;
        while(true){
            if(!isPrime(n)){
                boolean found = false;
                for(int i = 1; i < n; i++){
                    if(isPrime(i)){
                        double temp = (n - i) / 2;
                        if(Math.sqrt(temp) == (int)Math.sqrt(temp)){
                            found = true;
                            break;
                        }
                    }
                }
                if(!found){
                    System.out.println(n);
                    break;
                }
            }
            n+=2;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - begin + "ms");
    }
    static boolean isPrime(int n){
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
