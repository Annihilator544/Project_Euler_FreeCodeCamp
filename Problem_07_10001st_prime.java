public class Problem_07_10001st_prime {
    static int prime;
    static int count=0;
    static void nthPrime(int i){
    int k=2;
     while(i>=count){
        int flag=0;
        for(int j=2;j<k/2;j++){
            if(k%j==0){
                flag=1;
            }
        }
        if(flag==0){
            prime=k;
            count++;
        }
        k++;
        }
        System.out.println(prime);
    }
    public static void main(String[] args){
        nthPrime(10001);
    }
}
