public class Problem_52_Permuted_Multiples {
    public static void main(String[] args){
        long begin = System.currentTimeMillis();
        int i = 1;
        while(true){
            if(isPermutedMultiples(i)){
                System.out.println(i);
                break;
            }
            i++;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - begin + "ms");
    }
    static boolean isPermutedMultiples(int n){
        for(int i = 2; i <= 6; i++){
            if(!isPermutation(n, n*i)){
                return false;
            }
        }
        return true;
    }
    static boolean isPermutation(int a, int b){
        int[] digits = new int[10];
        while(a > 0){
            digits[a%10]++;
            a/=10;
        }
        while(b > 0){
            digits[b%10]--;
            b/=10;
        }
        for(int i = 0; i < 10; i++){
            if(digits[i] != 0){
                return false;
            }
        }
        return true;
    }
}
