public class Problem_41_Pandigital_Prime {
    public static void main(String[] args){
        long begin = System.currentTimeMillis();
        for(int i = 7654321; i > 0; i-=2){
            if(isPandigital(i)){
                if(isPrime(i)){
                    System.out.println(i);
                    break;
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end - begin + "ms");
    }
    static boolean isPandigital(int i){
        String s = Integer.toString(i);
        if(s.length()!=7){
            return false;
        }
        for(int j = 1; j < 8; j++){
            if(!s.contains(Integer.toString(j))){
                return false;
            }
        }
        return true;
    }
    static boolean isPrime(int i){
        if(i == 1){
            return false;
        }
        if(i == 2){
            return true;
        }
        if(i % 2 == 0){
            return false;
        }
        for(int j = 3; j <= Math.sqrt(i); j+=2){
            if(i % j == 0){
                return false;
            }
        }
        return true;
    }
}
