public class Problem_50_Consecutive_Prime_sum {
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        if(n==2){
            return true;
        }
        if(n%2==0){
            return false;
        }
        for(int i=3;i<=Math.sqrt(n);i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        long begin = System.currentTimeMillis();
        int sum=0;
            for(int i=0;i<1000;i++){
                if(isPrime(i)){
                    sum+=i;
                }
                
                if(isPrime(sum)){
                System.out.println(sum+"*");}
                if(sum>1000){
                            
                            break;
                        }
                
            }
            System.out.println(isPrime(953));
        long end = System.currentTimeMillis();
        System.out.println(end - begin + "ms"); 
    }
}
